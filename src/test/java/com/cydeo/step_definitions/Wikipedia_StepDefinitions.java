package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    Wikipedia_Page wikipedia_page = new Wikipedia_Page();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikipedia_page.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipedia_page.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {

        String header = wikipedia_page.pageHeader.getText();

Assert.assertTrue(header.contains(string));
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        String imgHeader = wikipedia_page.imgText.getText();
        Assert.assertEquals(imgHeader,string);
    }



}
