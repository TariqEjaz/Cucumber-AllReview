package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchService;

public class Google_SearchPage {
    public Google_SearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "q")
    public WebElement searchBox;

}


