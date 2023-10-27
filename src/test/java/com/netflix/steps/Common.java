package com.netflix.steps;

import Netflix.Navigate;
import core.selenium.WebDriverAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class Common {
    private Navigate navigate;
    private WebDriverAction action;

    public Common() {
        navigate = new Navigate();
        action = new WebDriverAction();
    }

    @Given("^I navigate to the home page$")
    public void navigatesToFeaturePage() {
        navigate.navigateHomePage();
    }

    @When("^I Maximize screen$")
    public void maximizeScreen() {
        action.maximizeScreen();
    }

    @Then("^I verify tittle should be \"(.*?)\"$")
    public void verifiesTittle(String tittle) {
        Assert.assertEquals(action.getTittle(), tittle, "The tittle should be:" + tittle);
    }

    @Then("^I verify url should be \"(.*?)\"$")
    public void verifiesUrl(String url) {
        Assert.assertEquals(action.getUrl(), url, "The url should be:" + url);
    }
}
