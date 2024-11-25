package tests.base;

import base.BaseTest;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.home.FacebookMainPagePF;
import utils.WaitUtils;

import static enums.WaitStrategy.ClICKABLE;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {

        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
       FacebookMainPagePF obj=new FacebookMainPagePF(driver);
        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");


        WaitUtils.applyWait(driver, obj.createAccountBtn, ClICKABLE  ) ;
        obj.clickCreateBtn();

        logger.info("Entering Sign in Details");
        obj.signIndetails();
        logger.info("Done");



        Assert.assertEquals(actualUrl, expectedUrl, "Failed");

    }


}