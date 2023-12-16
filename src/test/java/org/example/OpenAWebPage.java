package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{

    @Test
    public void openMvnrepositoryPageAndTestTitle(){
        browser.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
        Assert.assertEquals(browser.getTitle(), "Maven Repository: org.testng » testng » 7.8.0");
    }

    @Test
    public void openGooglePageAndTestTitle(){
        browser.get("https://google.com/");
        Assert.assertEquals(browser.getTitle(), "Google");
    }

}
