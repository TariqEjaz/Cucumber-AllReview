package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@login")//
    public void setupScenario() {
        System.out.println("===== Setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 1)//
    public void loginScenario() {
        System.out.println("===== Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        //  System.out.println("===== closing browser using cucumber @After");
        //  System.out.println("  Take screenshot if failed  ");
     // Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep() {

        System.out.println("--Applying setup using @beforeStep");
    }

    @AfterStep
    public void afterStep() {

        System.out.println("---Applying setup using @AfterStep");
    }
}
