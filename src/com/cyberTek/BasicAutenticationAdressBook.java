package com.cyberTek;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutenticationAdressBook {

    public static void main(String [] args){


        WebDriver driver = BrowseFactory.getDriver("firefox");

        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected title: "+expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }




        driver.close();
    }


}
