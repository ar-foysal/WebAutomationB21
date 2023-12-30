package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void testInteractionOfWebElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        WebElement firstNameInputBox = browser.findElement(By.xpath("//input[@id='fname']"));
        firstNameInputBox.sendKeys("Hello World");
        browser.findElement(By.xpath("//label[@for='male']")).click();
        Thread.sleep(1000);
        firstNameInputBox.clear();
        Thread.sleep(1000);
        String value =  browser.findElement(By.xpath("//input[@id='male']")).getAttribute("type");
        System.out.println(value);
        String cssValue =  browser.findElement(By.xpath("//label[@for='male']")).getCssValue("font-size");
        System.out.println(cssValue);

        String elementText =  browser.findElement(By.xpath("//label[@for='male']")).getText();
        System.out.println(elementText);

        Boolean displayed = browser.findElement(By.xpath("//label[@for='male']")).isDisplayed();
        System.out.println(displayed);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("Before clicking on the hide button:  " + displayed );
        browser.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("After clicking on the hide button:  " + displayed );

        Boolean enable = browser.findElement(By.xpath("//input[@id='displayed-text']")).isEnabled();
        System.out.println( enable );

        Boolean select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("Before select: " + select);
        browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("After select: " + select);
    }
}
