package pageObjectPattern.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

    private WebDriver driver;

    @FindBy(name = "address1")
    WebElement addressField;

    @FindBy(name = "postcode")
    WebElement zipField;

    @FindBy(name = "city")
    WebElement cityField;

    @FindBy(name = "id_country")
    private Select countrySelect;

    @FindBy(css = "#content > div > div > form > footer > button")
    WebElement saveButton;

    @FindBy(css = "#notifications > div > article > ul > li")
    WebElement successInformation;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillNewAddress (
            String address,
            String city,
            String zip,
            String country) {

        addressField.clear();
        addressField.sendKeys(address);

        zipField.clear();
        zipField.sendKeys(zip);

        cityField.clear();
        cityField.sendKeys(city);

        countrySelect.selectByVisibleText(country);

    }

    public void saveUserAddress() {
        saveButton.click();
    }

    public String getConfirmation() {
        return successInformation.getText();
    }

}
