package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chorme");

        driver.get("http:practice.cybertekschool.com/multiple_buttons");

        //click don't click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();
    }
}
