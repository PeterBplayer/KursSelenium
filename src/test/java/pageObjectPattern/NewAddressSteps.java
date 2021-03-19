package pageObjectPattern;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPattern.pages.AddressPage;
import pageObjectPattern.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class NewAddressSteps {

    AddressPage addressPage;
    WebDriver driver;

    @Given("User is logged in to my-store")
    public void userIsLoggedInToMyStore() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("pip@mail.com", "12345");
    }

    @When("^User goes to Your Account page clicks Addresses and then click Create new address$")
    public void userGoesToCreateNewAddressForm() {
        WebElement loggedUserLabel = driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));
        loggedUserLabel.click();
        WebElement userAddressLabel = driver.findElement(By.cssSelector("#addresses-link > span"));
        userAddressLabel.click();
        WebElement createNewAddressLink = driver.findElement(By.cssSelector("#content > div.addresses-footer > a > span"));
        createNewAddressLink.click();
        addressPage = new AddressPage(driver);
    }


    @And("^User inputs (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void userInputsAliasAddressZipCityCountryPhone(String alias, String address, String zip, String city, String country, String phone) {
        addressPage.fillNewAddress(alias, address, zip, city, country, phone);
    }

    @And("^User submits new address$")
    public void userSubmitsNewAddress() {
        addressPage.saveUserAddress();
    }

    @Then("^User will see \"([^\"]*)\" and (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void userWillSeeConfirmationAndNewAddress(String massage, String alias, String address, String zip, String city, String country, String phone) {
        Assert.assertEquals(massage,addressPage.getConfirmation());
        String lastAddressText = addressPage.getLastAddressText();
        Assert.assertTrue(lastAddressText.contains(alias));
        Assert.assertTrue(lastAddressText.contains(address));
        Assert.assertTrue(lastAddressText.contains(zip));
        Assert.assertTrue(lastAddressText.contains(city));
        Assert.assertTrue(lastAddressText.contains(country));
        Assert.assertTrue(lastAddressText.contains(phone));
        driver.quit();
    }
}
