package com.netflix.runner;

import core.selenium.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import  core.utils.ReportGenerator;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:build/cucumber/cucumber-pretty.html", "json:build/cucumber/cucumber.json"},
        glue = {"com.netflix"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @AfterTest
    public void afterExecution() {
        ReportGenerator.generateReport();
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
