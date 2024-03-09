package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvanceWebElements extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");
//        WebElement radio1 = browser.findElement(By.cssSelector("input[value='male']"));
//        radio1.click();
//        Thread.sleep(5000);
//
//        WebElement dropdown = browser.findElement(By.xpath("//select[@name='option']"));
//        dropdown.click();
//        Thread.sleep(5000);
        WebElement fname = browser.findElement(By.cssSelector("#fname"));
        fname.sendKeys("Hellowwwwwwwwwwwwwww");
        Thread.sleep(5000);

        /***Find child element through parent via cssSelector***/
        System.out.println(browser.findElement(By.cssSelector("div>h1")).getText());

        /***Find child element through parent via xpath***/
        System.out.println(browser.findElement(By.xpath("//div/h1")).getText());



        /***Find an element through multiple attributes via cssSelector***/
        System.out.println(browser.findElement(By.cssSelector("a[class='button bar-item'][href='/']")).getText());

        /***Find an element through multiple attributes via xpath***/
        System.out.println(browser.findElement(By.xpath("//a[@class='button bar-item' and @href='/']")).getText());



        /***Find an element through by substring or a static part of a value via cssSelector***/
        System.out.println(browser.findElement(By.cssSelector("button[onclick^= \" window.open('http://google.com',\"]")).getText());

        /***Find an element through by substring or a static part of a value via xpath***/
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick, \" window.open('http://google.com',\")]")).getText());



        /***Find an element through by substring of any part of a 'value' via cssSelector***/
        System.out.println(browser.findElement(By.cssSelector("button[onclick*= \"('http://google.com\"]")).getText());

        /***Find an element through by substring of any part of a 'value' via xpath***/
        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick, \"('http://google.com\")]")).getText());


        /*** Find an element from table via xpath***/
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());

        /*** Find an element from table via cssSelector***/
        System.out.println(browser.findElement(By.cssSelector("tr>th:nth-child(2)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());

        /*** Find an element by text 'only works on xpath' ***/
        System.out.println(browser.findElement(By.xpath("//td[text()=\"Singer\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),\"Singer\")]")).getText());


        /*** Find an element by text of siblings *(before and after elements)* 'only works on xpath' ***/
        System.out.println(browser.findElement(By.xpath("//td[text()='Bong'] / preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[text()='Bong'] / following-sibling::td[last()]")).getText());


    }
}
