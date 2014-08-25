package com.eviltester.com;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hamzarazzak on 25/08/2014.
 */


public class MyFirstTest {
    @Test

    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.seleniumsimplified.com");
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();



    }
}
