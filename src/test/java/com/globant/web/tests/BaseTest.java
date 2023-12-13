package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver = new ChromeDriver();
    LoginPages loginPages;
    @BeforeTest
    public LoginPages getLoginPages(){
        driver.manage().window().maximize();
        return new LoginPages(driver,"https://www.saucedemo.com/");
    }

    @AfterTest
    public void afterTest(){driver.close();}
}
