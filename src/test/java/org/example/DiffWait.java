package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffWait extends DriverSetup{

    @Test
    public void testDifferentWait() throws InterruptedException {
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        By delay_alert = By.id("delayalert");
        browser.get("https://qavbox.github.io/demo/alerts/");
        WebElement delay_alert_button = wait.until(ExpectedConditions.elementToBeClickable(delay_alert));
//        browser.findElement(delay_alert).click();
        delay_alert_button.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        Thread.sleep(10000);
//        Alert alert = browser.switchTo().alert();
        alert.accept();
//        Thread.sleep(10000);
//
//        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());

    }
}
