package com.cyberTek;

import org.openqa.selenium.WebDriver;

public class BasicNavigation {

    public static void main(String[] args) throws Exception{
        WebDriver driver = BrowseFactory.getDriver("firefox");

        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        Thread.sleep(1000);
        driver.navigate().to("http://google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Title "+ driver.getTitle());
        System.out.println("URL "+ driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.close();
    }
}
