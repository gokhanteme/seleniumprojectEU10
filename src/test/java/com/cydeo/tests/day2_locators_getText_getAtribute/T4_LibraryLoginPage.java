package com.cydeo.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        //TC # 4: Library verification
        //1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://librar2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");


        //3. Enter username:"incorrect@mail.com
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@mail.com");

        //4.Enter password:"incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        // 5.Click to sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();
        //6.verify: visually "Sorry, Wrong Email or Password"
        // displayed








    }
}
