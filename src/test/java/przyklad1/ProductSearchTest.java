package przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class ProductSearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @Test
    public void testProductSearch() {

        String[] products = {"T-shirt", "Cushion", "Sweater", "Vector", "Notebook", "Poster", "Mug"};

        Random random = new Random();
        int randomInteger = random.nextInt(6);

        randomInteger = randomInteger % products.length;

        WebElement element = driver.findElement(By.name("s"));
        element.clear();

        element.sendKeys(products[randomInteger]);
        element.submit();
    }

    @After
    public void tearDown() throws Exception {
//        driver.quit();
    }
}
