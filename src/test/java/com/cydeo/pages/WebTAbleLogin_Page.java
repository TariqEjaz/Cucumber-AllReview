package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTAbleLogin_Page {
    public WebTAbleLogin_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    /**
     * without parameter
     */
//    public void login() {
//        inputUsername.sendKeys("Test");
//        inputPassword.sendKeys("Tester");
//        loginButton.click();
//    }

    /**
     * pass parameter
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();

    }

    public void loginConfig(String usernameConfig, String passwordConfig) {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }


}
