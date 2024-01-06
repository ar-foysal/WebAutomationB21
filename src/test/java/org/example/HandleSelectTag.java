package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleSelectTag extends DriverSetup{

    @Test
    public void testDropDown() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        WebElement dropdown =  browser.findElement(By.id("option"));
        Select select = new Select(dropdown);
        dropdown.click();
        Thread.sleep(2000);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dropdown.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        select.selectByValue("option 3");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
        Thread.sleep(2000);

    }
}
