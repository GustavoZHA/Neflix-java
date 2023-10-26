package core.selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Configures an Edge webDriver.
 */
public class EdgeBrowser implements Browser {

    @Override
    public WebDriver getWebDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
