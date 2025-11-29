package LessonEleven;

import io.qameta.allure.*;
import org.example.LessonEleven.MtsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.time.Duration;

@Feature("MTS Онлайн пополнение")
@Story("Проверка блока пополнения без комиссии")
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
    @DisplayName("Проверка названия блока 'Онлайн пополнение'")
    @Description("Находит текст 'Онлайн пополнение' на главной странице")
    @Severity(SeverityLevel.BLOCKER)
    public void testFindNameOfBlock() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::findNameOfBlock);
    }

    @Test
    @DisplayName("Проверка логотипов Visa/MasterCard/Белкарт")
    @Description("Проверяет наличие всех 3 логотипов оплаты")
    @Severity(SeverityLevel.CRITICAL)
    public void testFindPaymentLogos() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::findPaymentLogos);
    }

    @Test
    @DisplayName("Проверка ссылки 'Подробнее о сервисе'")
    @Description("Кликает по ссылке подробностей")
    @Severity(SeverityLevel.NORMAL)
    public void testCheckMoreInfoLink() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::checkMoreInfoLink);
    }

    @Test
    @DisplayName("Проверка формы 'Услуги связи'")
    @Description("Заполняет форму: телефон, сумма, email → Продолжить")
    @Severity(SeverityLevel.CRITICAL)
    public void testCheckFormCommunicationService() {
        MtsPage page = new MtsPage(driver);
        page.acceptCookies();
        assertDoesNotThrow(page::checkFormCommunicationService);
    }

    @Test
    @DisplayName("Проверка выпадающего меню")
    @Description("Открывает dropdown 'Онлайн пополнение'")
    @Severity(SeverityLevel.BLOCKER)
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
