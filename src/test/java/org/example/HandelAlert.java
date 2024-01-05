package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandelAlert extends DriverSetup{

    @Test
    public void test_different_alert() {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You successfully clicked an alert");

        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Ok");

        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Cancel");

        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You entered: Hello");

        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You entered: null");
    }
}
