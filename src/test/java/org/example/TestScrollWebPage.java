package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScrollWebPage extends DriverSetup{
    @Test
    public void testScroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(3000);

        WebElement hoverButton = browser.findElement(By.xpath("//*[text()='Mouse Hover']"));

        js.executeScript("arguments[0].scrollIntoView();", hoverButton);

        Thread.sleep(3000);

    }
}
