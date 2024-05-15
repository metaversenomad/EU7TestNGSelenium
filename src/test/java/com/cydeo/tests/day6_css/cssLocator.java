package com.cydeo.tests.day6_css;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chorme");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick = driver.findElement(By.id("disappearing_buttonasdasd"));

        System.out.println(dontClick.getText());

        driver.quit();
    }
}
