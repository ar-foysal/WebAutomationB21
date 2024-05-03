package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIFrameElement extends DriverSetup{
    @Test
    public void testIFrameItems() throws InterruptedException {
//        browser.get("https://www.ebl.com.bd/onlineapply");
//        JavascriptExecutor js = (JavascriptExecutor) browser;
//        WebElement recaptcha_text = browser.findElement(By.xpath("//label[normalize-space()='Google Recaptcha']"));
//        js.executeScript("arguments[0].scrollIntoView();", recaptcha_text);
//        Thread.sleep(2000);
//        browser.switchTo().frame(0);
//        browser.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
//        Thread.sleep(5000);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) browser;
        WebElement hoverButton = browser.findElement(By.xpath("//*[text()='Mouse Hover']"));
        js.executeScript("arguments[0].scrollIntoView();", hoverButton);
//        browser.switchTo().frame(0);
//        browser.switchTo().frame("courses-iframe");
//        browser.switchTo().frame("iframe-name");
        WebElement frame= browser.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        browser.switchTo().frame(frame);
        Thread.sleep(5000);
        System.out.println(browser.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/sign_up'])[1]")).getText());
//        browser.switchTo().parentFrame();
        browser.switchTo().defaultContent();
        System.out.println(browser.findElement(By.xpath("//*[text()='Mouse Hover']")).getText());


//        browser.switchTo().frame(3);
//        browser.switchTo().frame(2);
//        browser.switchTo().parentFrame();
//        browser.switchTo().defaultContent();


//        1
//        2 1
//        3 1 2[1 2] 3
    }
}
