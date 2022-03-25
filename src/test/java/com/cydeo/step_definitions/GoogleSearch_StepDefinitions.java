package com.cydeo.step_definitions;

import com.cydeo.pages.Google_SearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

    Google_SearchPage googleSearchPage = new Google_SearchPage();

    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Driver.getDriver().getTitle();
    }

    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @Then("user sees apple is in the google title")
    public void user_sees_apple_is_in_the_google_title() {
      Driver.getDriver().getTitle();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }

}
