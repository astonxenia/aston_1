package org.example.LessonTen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MtsPage extends BasePage {

    private By onlineRefillBlock = By.xpath("//*[contains(text(), 'Онлайн пополнение')]");
    private By visaLogo = By.xpath("//img[@alt='Visa']");
    private By mastercardLogo = By.xpath("//img[@alt='MasterCard'][1]");
    private By belkartLogo = By.xpath("//img[@alt='Белкарт'][1]");
    private By moreInfoLink = By.xpath("//a[normalize-space(.) = 'Подробнее о сервисе']");
    private By servicesConnectionLabel = By.xpath("//span[contains(text(), 'Услуги связи')]");
    private By phoneNumberInput = By.id("connection-phone");
    private By sumInput = By.id("connection-sum");
    private By connectionEmail = By.id("connection-email");
    private By continueButton = By.xpath("//button[contains(text(), 'Продолжить')][1]");

    private By dropdownTrigger = By.xpath("//*[contains(text(), 'Онлайн пополнение')]/parent::*//button | //*[contains(text(), 'Онлайн пополнение')]/parent::*//*[contains(@class, 'dropdown')]");

    public MtsPage(WebDriver driver) {
        super(driver);
    }

    public void findNameOfBlock() {
        checkElement(onlineRefillBlock);
    }

    public void findPaymentLogos() {
        checkElement(visaLogo);
        checkElement(mastercardLogo);
        checkElement(belkartLogo);
    }

    public void checkMoreInfoLink() {
        driver.findElement(moreInfoLink).click();
    }

    public void checkFormCommunicationService() {
        driver.findElement(servicesConnectionLabel).click();
        driver.findElement(phoneNumberInput).clear();
        driver.findElement(phoneNumberInput).sendKeys("297777777");
        driver.findElement(sumInput).clear();
        driver.findElement(sumInput).sendKeys("10");
        driver.findElement(connectionEmail).clear();
        driver.findElement(connectionEmail).sendKeys("k@kk.ru");
        driver.findElement(continueButton).click();
    }

    public void testDropdownMenu() {
        checkElement(onlineRefillBlock);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownTrigger));
        driver.findElement(dropdownTrigger).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
    }
}
