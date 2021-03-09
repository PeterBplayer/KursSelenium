package pageObjectPattern.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {

    private WebDriver driver;

    @FindBy(name = "birthday")
    WebElement birthdayInput;

    @FindBy(name = "newsletter")
    WebElement newsletterCheckbox;

    @FindBy(css = ".btn.btn-primary.form-control-submit")
    WebElement submitButton;

    @FindBy(css = ".alert.alert-success")
    WebElement successInformation;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input")
    WebElement maleGenderRadioButton;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input")
    WebElement femaleGenderRadioButton;

    public UserInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void signInForNewsletter() {
        if (!newsletterCheckbox.isSelected())
            newsletterCheckbox.click();
    }

    public void signOutFromNewsletter () {
        if (newsletterCheckbox.isSelected())
            newsletterCheckbox.click();
    }

    public void setBirthdate(String birthDate) {
        birthdayInput.click();
        birthdayInput.clear();
        birthdayInput.sendKeys(birthDate);
    }

    public void changeGender() {
        if (maleGenderRadioButton.isSelected())
            femaleGenderRadioButton.click();
        else if (femaleGenderRadioButton.isSelected())
            maleGenderRadioButton.click();
    }

    public void submitUserInfo(String password) {
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public String getUpdateInformation() {
        return successInformation.getText();
    }
}
