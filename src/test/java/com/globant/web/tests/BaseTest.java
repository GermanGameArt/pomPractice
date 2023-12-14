package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import com.globant.web.pages.PurchasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver = new ChromeDriver();
    LoginPages loginPages;
    PurchasePage purchasePage;
    @BeforeTest
    public LoginPages getLoginPages(){
        driver.manage().window().maximize();
        return new LoginPages(driver,"https://www.saucedemo.com/");
    }

    public PurchasePage getPurchasePage(){
        driver.manage().window().maximize();
        return new PurchasePage(driver,"https://www.saucedemo.com/");
    }

    /*@AfterTest
    public void afterTest(){driver.close();}*/
}
