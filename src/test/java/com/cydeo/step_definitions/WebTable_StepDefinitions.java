package com.cydeo.step_definitions;

import com.cydeo.pages.WebTAbleLogin_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTAbleLogin_Page webTAbleLogin_page = new WebTAbleLogin_Page();

    @Given("user is on the login page of the Web_Table_App")
    public void user_is_on_the_login_page_of_the_web_table_app() {
      //  Driver.getDriver().get(ConfigurationReader.getProperty("Web.table.url"));
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials ) {

        webTAbleLogin_page.login(credentials.get("username"),credentials.get("password"));
    }


    @When("user enter the correct username {string} password {string} then click")
    public void user_enter_the_correct_username_password_then_click(String username, String password) {
     webTAbleLogin_page.login(username,password);
    }

    @When("user enter the correct username {string}")
    public void user_enter_the_correct_username(String string) {
        webTAbleLogin_page.inputUsername.sendKeys(string);

    }

    @When("user enter the correct password {string}")
    public void user_enter_the_correct_password(String string) {
        webTAbleLogin_page.inputPassword.sendKeys(string);
    }

    @When("user click the on the login button")
    public void user_click_the_on_the_login_button() {
        webTAbleLogin_page.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURL("orders");
    }


}
