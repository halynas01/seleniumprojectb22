package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args){
//        1 - setup the browser driver
        WebDriverManager.chromedriver().setup();
//        2 - create instance of selenium web driver
        WebDriver driver = new ChromeDriver();
//        3 - get the page for Tesla.com
        driver.get("https://www.tesla.com");
//         going back using navigations
        driver.navigate().back();
//        going forward using navigations
        driver.navigate().forward();


    }
}
