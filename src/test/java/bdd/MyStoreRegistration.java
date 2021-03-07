package bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreRegistration {

    private WebDriver driver;

    @Given("user is on registration page")

    public void goToRegistrationPage () {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
    }

    @When("user inputs (.*), (.*), (.*), (.*), (.*), (.*)")

    public void userInputs(String title, String firstName, String lastName, String email, String password, String birthDate) {

        if (title == "Mr") {
            WebElement titleButton = driver.findElement(By.cssSelector("#customer-form > section > div:nth-child(2) > div.col-md-6.form-control-valign > label:nth-child(1) > span > input[type=radio]"));
            titleButton.click();
        } else {
            WebElement titleButton = driver.findElement(By.cssSelector("#customer-form > section > div:nth-child(2) > div.col-md-6.form-control-valign > label:nth-child(2) > span > input[type=radio]"));
            titleButton.click();
        }

        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys(firstName);

        WebElement lastNameField = driver.findElement(By.name("lastname"));
        lastNameField.sendKeys(lastName);

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);

        WebElement dayOfBirth = driver.findElement(By.name("birthday"));
        dayOfBirth.sendKeys(birthDate);

    }

    @When("^user clicks Save button$")

    public void Submit() {

        driver.findElement(By.cssSelector("#customer-form > footer > button")).submit();

    }


    @Then("^user is registered$")

    public void userIsRegistered() throws Exception{

        // Zamknij przeglądarkę
        driver.quit();
    }
}
