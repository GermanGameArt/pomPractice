package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver = new ChromeDriver();
    LoginPages loginPages;

    @BeforeClass
    public void setUp(){
        loginPages = new LoginPages(driver,"https://www.saucedemo.com/");
    }

    @Test
    public void testLogin(){
        loginPages.enterUserName("standard_user");
        loginPages.enterPassword("secret_sauce");
        loginPages.clickOnLogin();
    }
}
