package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_Page {

    public Wikipedia_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="searchInput" )
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[text()='Steve Jobs']")
    public WebElement pageHeader;

    @FindBy(xpath = "//div[text()='Steve Jobs']")
    public WebElement imgText;
}
