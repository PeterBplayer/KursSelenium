package pageObjectPattern.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class AddressPage {

    private WebDriver driver;

    @FindBy(name = "alias")
    WebElement aliasField;

    @FindBy(name = "address1")
    WebElement addressField;

    @FindBy(name = "postcode")
    WebElement zipField;

    @FindBy(name = "city")
    WebElement cityField;

    @FindBy(name = "id_country")
//    private Select countrySelect;
    WebElement countrySelect;

    @FindBy(name = "phone")
    WebElement phoneField;

    @FindBy(css = "#content > div > div > form > footer > button")
    WebElement saveButton;

    @FindBy(css = "#notifications > div > article > ul > li")
    WebElement successInformation;

    @FindBy(xpath = "//*[@id=\"address-10169\"]/div[1]/h4")
    WebElement successAlias;

    @FindBy(xpath = "//*[@id=\"address-10167\"]/div[1]/address/text()[2]")
    WebElement successAddress;

    @FindBy(xpath = "//*[@id=\"address-10167\"]/div[1]/address/text()[3]")
    WebElement successCity;

    @FindBy(xpath = "//*[@id=\"address-10167\"]/div[1]/address/text()[4]")
    WebElement successZip;

    @FindBy(xpath = "//*[@id=\"address-10167\"]/div[1]/address/text()[5]")
    WebElement successCountry;

    @FindBy(xpath = "//*[@id=\"address-10167\"]/div[1]/address/text()[6]")
    WebElement successPhone;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillNewAddress (
            String alias,
            String address,
            String zip,
            String city,
            String country,
            String phone) {

        aliasField.clear();
        aliasField.sendKeys(alias);

        addressField.clear();
        addressField.sendKeys(address);

        zipField.clear();
        zipField.sendKeys(zip);

        cityField.clear();
        cityField.sendKeys(city);

        countrySelect.sendKeys(country);
//        countrySelect.selectByVisibleText(country);

        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void saveUserAddress() {
        saveButton.click();
    }

    public String getConfirmation() {
        return successInformation.getText();
    }

    public String getSuccessAlias() {
        return successAlias.getText();
    }

    public String getSuccessAddress() {
        return successAddress.getText();
    }

    public String getSuccessZip() {
        return successZip.getText();
    }

    public String getSuccessCity() {
        return successCity.getText();
    }

    public String getSuccessCountry() {
        return successCountry.getText();
    }

    public String getSuccessPhone() {
        return successPhone.getText();
    }
}
