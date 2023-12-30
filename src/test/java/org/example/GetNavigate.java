package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class GetNavigate extends DriverSetup{
    @Test
    public void testGetNav() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
        browser.navigate().to ("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
        browser.navigate().back();
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
        browser.navigate().forward();
        System.out.println(browser.getTitle());
        Thread.sleep(5000);
        browser.navigate().refresh();
        Thread.sleep(5000);
    }

    @Test
    public void testBrowserWindow() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);
        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to ("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);
        browser.switchTo().newWindow(WindowType.WINDOW);
        browser.navigate().to("https://facebook.com");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);
        browser.manage().window().minimize();
        Thread.sleep(3000);
        browser.manage().window().maximize();
        Thread.sleep(3000);
        browser.manage().window().fullscreen();
        Thread.sleep(3000);
        System.out.println(browser.getCurrentUrl());
        browser.close();
        browser.quit();
    }
}
