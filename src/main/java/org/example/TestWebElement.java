package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{
    @Test

    public void testElements() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");
        WebElement fname = browser.findElement(By.id("fname"));
        fname.sendKeys("Hellowwwwwwwwwwwwwww");

        WebElement radio = browser.findElement(By.id("female"));
        radio.click();
        Thread.sleep(5000);

        WebElement radio1 = browser.findElement(By.cssSelector("input[value='male']"));
        radio1.click();
        Thread.sleep(5000);

        WebElement dropdown = browser.findElement(By.xpath("//select[@name='option']"));
        dropdown.click();
        Thread.sleep(5000);

//        browser.get("https://www.youtube.com/");
//        WebElement history = browser.findElement(By.linkText("History"));
//        history.click();
//        Thread.sleep(5000);
    }
}
