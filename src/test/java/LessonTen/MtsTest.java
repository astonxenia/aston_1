package org.example.LessonTen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.time.Duration;

public class MtsTest {
    private ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.mts.by");
    }

    @Test
    public void testFindNameOfBlock() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::findNameOfBlock);
    }

    @Test
    public void testFindPaymentLogos() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::findPaymentLogos);
    }

    @Test
    public void testCheckMoreInfoLink() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::checkMoreInfoLink);
    }

    @Test
    public void testCheckFormCommunicationService() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::checkFormCommunicationService);
    }

    @Test
    public void testFullOnlineRefill() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        page.testDropdownMenu();
    }


    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
