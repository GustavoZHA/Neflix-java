package com.netflix.runner;

import core.selenium.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import  core.utils.ReportGenerator;


public class RunnerTest extends AbstractTestNGCucumberTests {

    @AfterTest
    public void afterExecution() {
        ReportGenerator.generateReport();
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
