package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

        WebElement firstName = browser.findElement(By.id("fname"));
        firstName.sendKeys("Hello World");
        Thread.sleep(1000);

        WebElement LastName = browser.findElement(By.name("lname"));
        LastName.sendKeys("QA");
        Thread.sleep(1000);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement text = browser.findElement(By.className("ui-autocomplete-input"));
        text.sendKeys("Locate using class name");
        Thread.sleep(1000);

        WebElement freeCourse = browser.findElement(By.partialLinkText("Free Access to InterviewQues"));
        System.out.println(freeCourse.getText());
        Thread.sleep(1000);

        WebElement openTab = browser.findElement(By.linkText("Open Tab"));
        openTab.click();
        Thread.sleep(1000);

        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
        radioButton1.click();
        Thread.sleep(1000);

        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        selectDropdown.click();
        Thread.sleep(5000);






    }
}
