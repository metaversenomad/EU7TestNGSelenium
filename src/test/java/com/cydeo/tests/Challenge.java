package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Challenge {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.manage().window().maximize();

        driver.get("https://www.mercedes-benz.co.uk/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE");
        Thread.sleep(2000);

        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Count of cookies = " + allCookies.size());

        for (Cookie cookie : allCookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("Value: " + cookie.getValue());
            System.out.println("Class: " + cookie.getClass());
            System.out.println("****************************");
        }
        driver.findElement(By.xpath("//E[starts-with(@A, 'Agree')]")).click();
        driver.quit();
    }
}