package com.cyberTek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VyTrackLogin {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver",
                "/Users/yusufbayer/Downloads/selenium-java-3.141.59/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();

       // driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");

        WebElement inputEmail = driver.findElement(By.id("session_email"));
        inputEmail.sendKeys("user7");

        WebElement inputPassword = By.id("session_password").findElement(driver);
        inputPassword.sendKeys("UserUser123");

        WebElement clickLoginButton = driver.findElement(By.id("_submit"));
        clickLoginButton.click();

        //driver.close();


    }
}
