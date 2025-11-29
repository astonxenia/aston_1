package LessonNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
    WebDriver driver;

    private void acceptCookies() {
        try {
            WebElement cookieButton = driver.findElement(
                    By.xpath("//div[contains(@class, 'cookie')]//button[contains(text(), 'Принять')]"));
            cookieButton.click();
            System.out.println("Куки приняты");
        } catch (Exception e) {
            System.out.println("Куки не найдены");
        }
    }

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.mts.by");
        acceptCookies();
    }

    @AfterEach
    public void close() {
        driver.quit();
    }

    @Test
    public void findNameOfBlock() {
        WebElement block = driver.findElement(By.xpath(
                "//*[contains(text(), 'Онлайн пополнение')]"));
        String text = block.getText().trim();
        assertTrue(text.length() > 0);
        System.out.println("Название блока найдено: " + text);
    }

    @Test
    public void findPaymentLogos() {
        WebElement visaLogo = driver.findElement(
                By.xpath("//img[@alt='Visa']"));
        System.out.println("Логотип Visa найден");

        WebElement mastercardLogo = driver.findElement(
                By.xpath("//img[@alt='MasterCard'][1]"));
        System.out.println("Логотип MasterCard найден");

        WebElement belkartLogo = driver.findElement(
                By.xpath("//img[@alt='Белкарт'][1]"));
        System.out.println("Логотип Белкарт найден");
    }

    @Test
    public void checkMoreInfoLink() {
        WebElement link = driver.findElement(
                By.xpath("//a[normalize-space(.) = 'Подробнее о сервисе']"));
        String oldUrl = driver.getCurrentUrl();
        link.click();
        String newUrl = driver.getCurrentUrl();
        assertTrue(!newUrl.equals(oldUrl));
        System.out.println("Ссылка 'Подробнее о сервисе' работает");
    }

    @Test
    public void checkFormCommunicationService() {
        WebElement serviceCommunication = driver.findElement(
                By.xpath("//span[contains(text(), 'Услуги связи')]"));
        serviceCommunication.click();

        WebElement phoneNumberInput = driver.findElement(By.id("connection-phone"));
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys("297777777");

        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.clear();
        sumInput.sendKeys("10");

        WebElement connectionEmail = driver.findElement(By.id("connection-email"));
        connectionEmail.clear();
        connectionEmail.sendKeys("k@kk.ru");

        WebElement continueButton = driver.findElement(
                By.xpath("//button[contains(text(), 'Продолжить')][1]"));
        continueButton.click();
    }
}
