package com.cydeo.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {

 //task open Chorme and navigate to http://parctice.cybertekschool.com
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

//getting title with Selenium
        String title = driver.getTitle();

//getting title with Selenium
//shortcut for creating variable
//option or ALT + ENTER ENTER
//getTitle()--> get you the title of the page

//"soutv" + ENTER to print variable name and value
        System.out.println("title = " + title);

//getCurrentUrl --> get the url from browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

//getPageSource() --> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }
}