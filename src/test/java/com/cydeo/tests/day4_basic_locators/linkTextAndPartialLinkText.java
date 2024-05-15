package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextAndPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement Link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        //Link1.click();

        WebElement Link4 = driver.findElement(By.partialLinkText("Example 4"));
        Link4.click();

    }
}
