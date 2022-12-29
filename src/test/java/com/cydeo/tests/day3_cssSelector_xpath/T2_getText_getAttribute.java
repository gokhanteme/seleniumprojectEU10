package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
     */

    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else {
            System.out.println("actualRememberMeLabel = " + actualRememberMeLabel);
            System.out.println("expectedRememberMeLabel = " + expectedRememberMeLabel);
            System.out.println("Label verification FAİLED!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPassword = "Forgot your password?";
        String actualForgotPassword = forgotPassword.getText();

        if (actualForgotPassword.equals(expectedForgotPassword)){
            System.out.println("Forgot password password link verification PASSED!");
        }else {

            System.out.println("actualForgotPassword = " + actualForgotPassword);
            System.out.println("expectedForgotPassword = " + expectedForgotPassword);
            System.out.println("Forgot password password link verification FAİLED!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHrefAttributeValue ="forgot_password=yes";
        String actualInHrefAttributeValue = forgotPassword.getAttribute("href");

        System.out.println("actualInHrefAttributeValue = " + actualInHrefAttributeValue);

        if (actualInHrefAttributeValue.contains(expectedInHrefAttributeValue)){
            System.out.println("HREF attribute value verification PASSED!");
        }else {
            System.out.println("HREF attribute value verification FAİLED!");
        }

        driver.close();

    }





}
