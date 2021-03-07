package przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Uruchom przeglądarkę Firefox
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();

        // Uruchom nowy egzemplarz przeglądarki Chrome
        //System.setProperty("webdriver.chrome.driver",
        //        "src/main/resources/drivers/chromedriver.exe");
        //driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Binga
        driver.get("https://www.bing.com/");
    }

    @Test
    public void testBingSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        element.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");

        // Prześlij formularz
        element.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
       // driver.quit();
    }
}
