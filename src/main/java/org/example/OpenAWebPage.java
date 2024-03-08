package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenAWebPage extends DriverSetup {

   @Test
    public void openAPage()
    {
        browser.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
        Assert.assertEquals(this.browser.getTitle(), "Maven Repository: org.testng » testng » 7.9.0");

    }
}
