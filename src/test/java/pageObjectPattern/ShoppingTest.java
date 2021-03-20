package pageObjectPattern;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPattern.pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ShoppingTest {

    private WebDriver driver;

    @Before
    public void setUpBeforeClass() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("pip@mail.com", "12345");
        Assert.assertEquals("Bartłomiej Golas", loginPage.getLoggedUsername());
    }

    @Test
    public void OrderingProduct() throws InterruptedException {
        //Product search
        WebElement searchField = driver.findElement(By.name("s"));
        searchField.sendKeys("Hummingbird Printed Sweater");
        searchField.submit();
        WebElement sweater = driver.findElement(By.cssSelector("#js-product-list > div.products.row > article:nth-child(1)"));
        sweater.click();
        //Adding to cart
        WebElement sizeList = driver.findElement(By.id("group_1"));
        sizeList.sendKeys("M");
        Thread.sleep(500);
        WebElement quantityField = driver.findElement(By.id("quantity_wanted"));
        quantityField.clear();
        quantityField.sendKeys("5");
        WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button"));
        addToCartButton.click();
        WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"));
        proceedToCheckoutButton.click();
        //Checkout
        driver.findElement(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.card-block > div > a")).click();
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();
        driver.findElement(By.id("payment-option-1")).click();
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button")).click();
    }

    @After
    public void tearDown() throws IOException {
        //Order confirmation screenshot
        File confirmationScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(confirmationScreenshot, new File("C:\\Users\\Użytkownik\\Desktop\\Piotr\\Coders Lab\\Java\\KursSelenium\\screenshot.png"));
        driver.quit();
    }

}
