package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework {
    public class firstFiveCases {

        WebDriver driver;
        @BeforeMethod

        public void setUp(){

            driver = WebDriverFactory.getDriver("chorme");
            driver.manage().window().maximize();
            driver.get("https://practice-cybertekschool.herokuapp.com/");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        @AfterMethod
        public void close() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }
        @Test
        public void case1(){
            WebElement registrationForm = driver.findElement(By.linkText("Registration Form"));
            registrationForm.click();
        }
    }
}