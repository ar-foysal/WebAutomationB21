package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class DriverSetup {
    public WebDriver browser;

    @BeforeSuite
    public void openABrowser(){
        browser = new EdgeDriver();
        browser.manage().window().maximize();
    }

    @AfterSuite
    public void quiteBrowser(){
        browser.quit();
    }
}
