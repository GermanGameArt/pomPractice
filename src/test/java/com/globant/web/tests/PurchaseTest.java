package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import com.globant.web.pages.PurchasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PurchaseTest extends BaseTest{

    PurchasePage purchasePage;
    @Test
    public void testLogin(){
        LoginPages loginPages = getLoginPages();
        loginPages.enterUserName("standard_user");
        loginPages.enterPassword("secret_sauce");
        loginPages.clickOnLogin();
        Assert.assertEquals(loginPages.getTextToValidate(),"Products");
    }
}