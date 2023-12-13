package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void testLogin(){
        LoginPages loginPages = getLoginPages();
        loginPages.enterUserName("standard_user");
        loginPages.enterPassword("secret_sauce");
        loginPages.clickOnLogin();
    }
}
