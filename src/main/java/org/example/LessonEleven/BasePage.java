package org.example.LessonEleven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        try {
            driver.findElement(
                    By.xpath("//div[contains(@class, 'cookie')]//button[contains(text(), 'Принять')]")).click();
        } catch (Exception e) {}
    }

    public void checkElement(By locator) {
        driver.findElement(locator);
    }
}