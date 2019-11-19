package com.cyberTek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPageSource {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
        " /Users/yusufbayer/Downloads/selenium-java-3.141.59/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }

}
