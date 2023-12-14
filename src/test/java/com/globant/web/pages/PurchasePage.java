package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class PurchasePage extends BasePage {
    @FindBy(className = "inventory_item_img")
    private List <WebElement> addButton;

    public void clickOnAddButton(){
        int randomIndex = new Random().nextInt(addButton.size());
        addButton.get(randomIndex).click();
    }

    public PurchasePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
}
