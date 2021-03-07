package przyklad2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KatalonTest {
    private WebDriver driver;

    @Before
    public void setUp() {

        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Binga
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void fillFormTest() {
        // Znajdź element o nazwie First Name oraz pole wypełnienia
        WebElement firstNameLabel = driver.findElement(By.cssSelector("#infoForm > div:nth-child(1) > label"));
        WebElement firstName = driver.findElement(By.name("firstName"));
        // Wyczyść tekst zapisany w elemencie
        // firstName.clear();
        // Wpisz imię Karol jeśli pole jest aktywne
        if (firstName.isEnabled()) {
            //Wpisz wpisz imię Karol
            firstName.sendKeys("Karol");
        } else {
            Assert.fail();
        }
        System.out.println(firstNameLabel.getText() + " : " + firstName.getAttribute("value"));

        // Znajdź element Last Name oraz pole do wypełnienia
        WebElement lastNameLabel = driver.findElement(By.cssSelector("*[for = last-name]"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        // Wyczyść tekst zapisany w elemencie
        //lastName.clear();
        // Wpisz nazwisko Kowalski jeśli pole jest aktywne
        if (lastName.isEnabled()) {
            // Wpisz wpisz nazwisko Kowalski
            lastName.sendKeys("Kowalski");
        } else {
            Assert.fail();
        }
        System.out.println(lastNameLabel.getText() + " : " + lastName.getAttribute("value"));

        // Znajdź checkbox Male oraz etykietę Gender
        WebElement genderRadioButton = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        WebElement genderLabel = driver.findElement(By.cssSelector("[for='gender']"));
        // Sprawdź czy pole jest zaznaczone, jeśli nie zaznacz checkbox Male
        if (genderRadioButton.isSelected()) {
            Assert.fail();
        } else {
            // Zaznacz pole Male
            genderRadioButton.click();
        }
        System.out.println(genderLabel.getText() + " : " + genderRadioButton.getAttribute("innerText"));


        // Znajdź element Date of Birth oraz etykietę
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        WebElement dateOfBirthLabel = driver.findElement(By.cssSelector("[for='dob']"));
        // Wpisz datę 10/20/2010 jeśli pole jest aktywne
        if (dateOfBirth.isEnabled()) {
            // Wpisz datę urodzenia 10/22/2010
            dateOfBirth.sendKeys("10/20/2010");
            // Zamknij pole z kalendarzem
            dateOfBirth.sendKeys(Keys.ESCAPE);
        } else {
            Assert.fail();
        }
        System.out.println(dateOfBirthLabel.getText() + " : " + dateOfBirth.getAttribute("value"));


        // Znajdź element Address oraz etykietę
        WebElement address = driver.findElement(By.id("address"));
        WebElement addressLabel = driver.findElement(By.cssSelector("[for='address']"));
        // Wpisz adres jeśli pole jest aktywne
        if (address.isEnabled()) {
            // Wpisz adres Prosta 51
            address.sendKeys("Prosta 51");
        } else {
            Assert.fail();
        }
        System.out.println(addressLabel.getText() + " : " + address.getAttribute("value"));

        // Znajdź element Email oraz etykietę
        WebElement email = driver.findElement(By.id("email"));
        WebElement emailLabel = driver.findElement(By.cssSelector("[for='email']"));
        // Wpisz email jeśli pole jest aktywne
        if (email.isEnabled()) {
            // Wpisz email karol.kowalski@mailinator.com
            email.sendKeys("karol.kowalski@mailinator.com");
        } else {
            Assert.fail();
        }
        System.out.println(emailLabel.getText() + " : " + email.getAttribute("value"));


        // Znajdź element Password oraz etykietę
        WebElement password = driver.findElement(By.id("password"));
        WebElement passwordLabel = driver.findElement(By.cssSelector("[for='password']"));
        // Wpisz hasło jeśli pole jest aktywne
        if (password.isEnabled()) {
            // Wpisz hasło Pass123
            password.sendKeys("Pass123");
        } else {
            Assert.fail();
        }
        System.out.println(passwordLabel.getText() + " : " + password.getAttribute("value"));


        // Znajdź element Company oraz etykietę
        WebElement company = driver.findElement(By.id("company"));
        WebElement companyLabel = driver.findElement(By.cssSelector("[for='company']"));
        // Wpisz nazwę firmy jeśli pole jest aktywne
        if (company.isEnabled()) {
            // Wpisz nazwę Coders Lab
            company.sendKeys("Coders Lab");
        } else {
            Assert.fail();
        }
        System.out.println(companyLabel.getText() + " : " + company.getAttribute("value"));


        // Znajdź element Comment oraz etykietę
        WebElement comment = driver.findElement(By.id("comment"));
        WebElement commentLabel = driver.findElement(By.cssSelector("[for='comment']"));
        // Wpisz komentarz jeśli pole jest aktywne
        if (comment.isEnabled()) {
            // Wpisz komentarz
            comment.sendKeys("To jest mój pierwszy automat testowy");
        } else {
            Assert.fail();
        }
        System.out.println(commentLabel.getText() + " : " + comment.getAttribute("value"));

        // Prześlij formularz
        driver.findElement(By.id("submit")).click();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    }
}
