package com.cydeo.tests.day3_webelement_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) {

        /*Verify URL not changed
-open Chrome browser
-go to http://practice.cybertekschool.com/forgot_password Links to an external site.
-click on Retrieve password
-verify that url did not change
        */

        //open Chorme browser
        WebDriver driver = WebDriverFactory.getDriver("chorme");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected URL before clicking button
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement --> Interface that represent elements on the page
        //findElement --> method used to find element on a page
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //save actual URL after clicking button
        String actualURL = driver.getCurrentUrl();

        //verify that URL did not change
        if (expectedUrl.equals(actualURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //close your browser
        driver.quit();
    }
}
