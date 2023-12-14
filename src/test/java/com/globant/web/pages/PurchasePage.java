package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class PurchasePage{
    //Mapear los objetos con el id desde el navegador
    @FindBy(id="user-name")
    private WebElement userName;

    @FindBy (id="password")
    private WebElement password;

    @FindBy (id="login-button")
    private WebElement loginButton;

    @FindBy(className = "inventory_item_img")
    private List<WebElement> inventoryItems;

    @FindBy(className = "title")
    private WebElement validateText;

    //Métodos que permiten la interaccion con los objetos
    public void enterUserName(String user){
        userName.sendKeys(user);
    }

    public void enterPassword(String psw){
        password.sendKeys(psw);
    }

    public void clickOnLogin(){
        loginButton.click();
    }

    public String getTextToValidate(){
        return validateText.getText();
    }

    public void selectRandomProduct() {
        int randomIndex = new Random().nextInt(inventoryItems.size());
        inventoryItems.get(randomIndex).click();
    }
}
