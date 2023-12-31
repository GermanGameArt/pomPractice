package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPages extends BasePage {
    //Mapear los objetos con el id desde el navegador
    @FindBy (id="user-name")
    private WebElement userName;

    @FindBy (id="password")
    private WebElement password;

    @FindBy (id="login-button")
    private WebElement loginButton;

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

    public LoginPages(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
}
