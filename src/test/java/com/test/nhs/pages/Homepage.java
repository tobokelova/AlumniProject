package com.test.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;


    public void sendingInformation(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        signInButton.click();
    }
}
