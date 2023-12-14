package com.globant.web.tests;

import com.globant.web.pages.LoginPages;
import com.globant.web.pages.PurchasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {
    @Test
    public void testPurchase(){
        LoginPages loginPages = getLoginPages();
        PurchasePage purchasePage = getPurchasePage();
        loginPages.enterUserName("standard_user");
        loginPages.enterPassword("secret_sauce");
        loginPages.clickOnLogin();
        Assert.assertEquals(loginPages.getTextToValidate(),"Products");
        purchasePage.clickOnAddButton();
        purchasePage.clickOnAddCart();
        purchasePage.clickOnCart();
        purchasePage.clickOnCheckout();
        purchasePage.enterFirstName("Emily");
        purchasePage.enterLastName("Davis");
        purchasePage.enterPostalCode("Los Angeles, CA: 90001");
        purchasePage.clickOnContinue();
        purchasePage.clickOnFinishBtn();
        Assert.assertEquals(purchasePage.getTextToValidate(),"Thank you for your order!");
    }
}
