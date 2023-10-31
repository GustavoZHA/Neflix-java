package com.netflix.steps;

import Netflix.Navigate;
import core.selenium.WebDriverAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.apache.logging.log4j.Logger;

public class Common {
    private Navigate navigate;
    private WebDriverAction action;
    private Logger log = LogManager.getLogger(getClass());

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
        String tittleActual = action.getTittle();
        log.info(tittleActual);
        Assert.assertEquals(tittleActual, tittle, "The tittle should be:" + tittle);
    }

    @Then("^I verify url should be \"(.*?)\"$")
    public void verifiesUrl(String url) {
        String urlActual = action.getUrl();
        log.info(urlActual);
        Assert.assertEquals(urlActual, url, "The url should be:" + url);
    }
}
