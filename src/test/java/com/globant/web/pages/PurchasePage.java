package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class PurchasePage extends BasePage {
    @FindBy(className = "inventory_item_img")
    private List <WebElement> addButton;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addProduct;

    @FindBy(className = "shopping_cart_link")
    private WebElement shopCart;

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    @FindBy(id = "finish")
    private WebElement finishBtn;

    @FindBy(className = "complete-header")
    private WebElement validateText;

    public void clickOnAddButton(){
        int randomIndex = new Random().nextInt(addButton.size());
        addButton.get(randomIndex).click();
    }
    public void clickOnAddCart(){
        addProduct.click();
    }

    public void clickOnCart(){
        shopCart.click();
    }

    public void clickOnCheckout(){
        checkout.click();
    }

    public void clickOnContinue(){
        continueBtn.click();
    }

    public void clickOnFinishBtn(){
        finishBtn.click();
    }

    public String getTextToValidate(){
        return validateText.getText();
    }

    public void enterFirstName(String name){
        firstName.sendKeys(name);
    }

    public void enterLastName(String last){
        lastName.sendKeys(last);
    }

    public void enterPostalCode(String postal){
        postalCode.sendKeys(postal);
    }

    public PurchasePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
}
