package com.cydeo.tests.day3_webelement_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    public static void main(String[] args) throws InterruptedException {
        /*Verify URL changed
    -open browser
    -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
    -enter any email
    -click on Retrieve password
    -verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        //open Chorme browser
        WebDriver driver = WebDriverFactory.getDriver("Chorme");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@smith.com");

        //click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        Thread.sleep(300);

        //TASK
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        //create expectedUrl
        String expectedUrl = " http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter any email and click retrieve password button
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = "+ expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }
        //close browser
        driver.quit();
    }
}
