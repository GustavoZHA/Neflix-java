package core.utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    /**
     * Sets up and creates the cucumber report.
     */
    public static void generateReport() {
        File reportOutputDirectory = new File("build/cucumber");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("build/cucumber/cucumber.json");
        String projectName = "NetflixProject";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("Branch", "release/1.0");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }
}
