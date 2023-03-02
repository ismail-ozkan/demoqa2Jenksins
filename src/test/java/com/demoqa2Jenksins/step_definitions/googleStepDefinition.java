package com.demoqa2Jenksins.step_definitions;

import com.demoqa2Jenksins.utilities.BrowserUtils;
import com.demoqa2Jenksins.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class googleStepDefinition {

    @Given("go to google homepage")
    public void go_to_google_homepage() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("verify title of {string}")
    public void verify_title_of_google(String title) {
        BrowserUtils.verifyTitle(title);
    }

}
