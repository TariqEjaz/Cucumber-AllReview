package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before //
    public void setupScenario() {
        System.out.println("===== Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario() {
        System.out.println("===== closing browser using cucumber @After");
        System.out.println("  Take screenshot if failed  ");
    }

    @BeforeStep
    public void setupStep() {

        System.out.println("--Applying setup using @beforeStep");
    }

    @AfterStep
    public void afterStep(){

        System.out.println("---Applying setup using @AfterStep");
    }
}
