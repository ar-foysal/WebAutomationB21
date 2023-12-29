package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
//        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        
        WebElement text = browser.findElement(By.cssSelector(".ui-autocomplete-input"));
        text.sendKeys("Locate using css selector");
        Thread.sleep(500);

        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.findElement(By.xpath("//h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("h1")).getText());

        WebElement firstName = browser.findElement(By.xpath("//*[@id='fname']"));
        firstName.sendKeys("Hello World xpath");
        Thread.sleep(500);
        firstName.clear();
        firstName = browser.findElement(By.cssSelector("#fname"));
        firstName.sendKeys("Hello World cssSelector");
        Thread.sleep(500);

        System.out.println(browser.findElement(By.xpath("//div /h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());

        System.out.println(browser.findElement(By.xpath("//a[@class='button bar-item' and @href='/' ]")).getText());
        System.out.println(browser.findElement(By.cssSelector("a[class='button bar-item' ][href='/' ]")).getText());

        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick, \" window.open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google.com',\"]")).getText());

        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick,\"open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick*=\"open('http://google.com',\"]")).getText());

        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());

        System.out.println(browser.findElement(By.cssSelector("tr > th:first-child")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());

        System.out.println(browser.findElement(By.xpath("//td[text()='Personal Shopper']")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'ersonal Sh')]")).getText());

        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /following-sibling::td[last()]")).getText());
    }
}
