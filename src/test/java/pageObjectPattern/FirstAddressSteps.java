package pageObjectPattern;

import cucumber.api.PendingException;
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

public class FirstAddressSteps {

    AddressPage addressPage;
    WebDriver driver;

    @Given("^User is properly logged in to CodersLab$")
    public void UserIsProperlyLogged() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("pip@mail.com","12345");
    }

    @When("^User goes to UserAddressPage$")
    public void userGoesToUserNewAddressPage() {
        WebElement loggedUserLabel = driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));
        loggedUserLabel.click();
        WebElement newAddressForm = driver.findElement(By.cssSelector("#address-link > span"));
        newAddressForm.click();
        addressPage = new AddressPage(driver);
    }

    @And("^User fill new address fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userFillNewAddressFields(String address, String zip, String city, String country) {
        addressPage.fillNewAddress("Home",address, zip, city, country, "000000000");
    }

    @And("^User saves new shipping address$")
    public void userSavesNewShippingAddress() {
        addressPage.saveUserAddress();
    }

    @Then("^User will see \"([^\"]*)\"$")
    public void userWillSee(String massage) {
        Assert.assertEquals(massage, addressPage.getConfirmation());
    }
}
