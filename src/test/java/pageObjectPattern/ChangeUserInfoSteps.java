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
import pageObjectPattern.pages.LoginPage;
import pageObjectPattern.pages.UserInfoPage;

import java.util.concurrent.TimeUnit;

public class ChangeUserInfoSteps {

    UserInfoPage userInfoPage;
    WebDriver driver;

    @Given("^User is logged in to CodersLab shop$")
    public void userIsLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("pip@mail.com","12345");
    }

    @When("^User goes to UserInformationPage$")
    public void userGoesToUserInformationPage() {
        WebElement loggedUserLabel = driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));
        loggedUserLabel.click();
        WebElement userInformationForm = driver.findElement(By.cssSelector("#identity-link > span"));
        userInformationForm.click();
    }

    @And("^User changes his birthday to \"([^\"]*)\"$")
    public void userChangesHisBirthdayTo(String birthDate) {
        userInfoPage.setBirthdate(birthDate);
    }


    @And("^User changes gender$")
    public void userChangesGender() {
        userInfoPage.changeGender();
    }

    @And("^User signs up for our newsletter$")
    public void userSignsUpForOurNewsletter() {
        userInfoPage.signInForNewsletter();
    }

    @And("^User saves information$")
    public void userSavesInformation() {
        userInfoPage.submitUserInfo("12345");
    }


    @Then("^User sees \"([^\"]*)\"$")
    public void userSees(String massage) {
        Assert.assertEquals(massage, userInfoPage.getUpdateInformation());
    }
}

