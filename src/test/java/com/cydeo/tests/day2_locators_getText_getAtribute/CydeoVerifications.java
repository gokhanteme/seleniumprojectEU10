package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoVerifications {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Go to www.practice.cydeo.com.
        driver.navigate().to("https://practice.cydeo.com");

        //3.verify url contains
        //expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAİLED");

        }

        // 4.Verify title:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {

            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAİLED");

        }

        driver.close();


    }
}
