package com.cyberTek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowseFactory {


    public static WebDriver getDriver(String browser){

        if(browser.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "/Users/yusufbayer/Downloads/selenium-java-3.141.59/drivers/chromedriver");
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/yusufbayer/Downloads/selenium-java-3.141.59/drivers/geckodriver");
            return new FirefoxDriver();
        }else{
            return null;
        }
    }
}
