package com.cydeo.tests.day5_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

/*
    * TASK
    * go to amazon-com
    * search for selenium
    * click search button
    * verify 1-48 of 304 results for "selenium"
*/

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chorme");

        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("Selenium");

        //click search button
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resutlText = result.getText();

        System.out.println("resultText = " + resutlText);

        String expectedResult = "1-48 of over 5,000 results for";

        if(expectedResult.equals(resutlText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resutlText);
        }

        driver.quit();
    }
}
