package pageObjectPattern.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

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
    WebElement countrySelect;

    @FindBy(name = "phone")
    WebElement phoneField;

    @FindBy(css = "#content > div > div > form > footer > button")
    WebElement saveButton;

    @FindBy(css = "#notifications > div > article > ul > li")
    WebElement successInformation;

    @FindBy(css = "article.address")
//    @FindBy(xpath = "(//article[@class = 'address'])[last()]")
    List<WebElement> addresses;

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

        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void saveUserAddress() {
        saveButton.click();
    }

    public String getConfirmation() {
        return successInformation.getText();
    }

    public String getLastAddressText() {
      WebElement lastAddress = addresses.get(addresses.size()-1);
      return lastAddress.getText();
    }

}
