package com.cyberTek;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowseFactory.getDriver("firefox");
        List<String> titles = new ArrayList<>();
        for(String url: urls){
            driver.get(url);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            titles.add(driver.getTitle());
        }
        String expectedTitle="Practice";
        for(String title:titles){
            if(title.equals(expectedTitle)){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
                System.out.println("Expected title: "+expectedTitle);
                System.out.println("Actual title: "+ title);
            }
        }
        driver.close();
    }
}
