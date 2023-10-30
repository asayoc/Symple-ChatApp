package com.udacity.jwdnd.c1.review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    @FindBy(id = "inputFirstName")
    private WebElement inputFirstName;

    @FindBy(id = "inputLastName")
    private WebElement inputLastName;

    @FindBy(id = "inputUsername")
    private WebElement inputUsername;

    @FindBy(id = "inputPassword")
    private WebElement inputPassword;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    @FindBy(id = "success-msg")
    private WebElement successMsg;

    @FindBy(id = "error-msg")
    private WebElement errorMsg;

    public SignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void submitForm() {
        submitButton.click();
    }

    public void setFirstName(String name) {
        inputFirstName.sendKeys(name);
    }

    public void setLastName(String name) {
        inputLastName.sendKeys(name);
    }

    public void setUserName(String name) {
        inputUsername.sendKeys(name);
    }

    public void setPassword(String pwd) {
        inputPassword.sendKeys(pwd);
    }

    public String getMessage(String type) {
        String res = "";

        if(type.equals("SUCCESS")) {
            res = successMsg.getText();
        } else if(type.equals("ERROR")) {
            res = errorMsg.getText();
        }

        return res;
    }

}
