package core.selenium.driver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;

public final class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver getDriver(final String type) {
        switch (type) {
            case "CHROME":
                return new ChromeBrowser().getWebDriver();
            case "EDGE":
                return new EdgeBrowser().getWebDriver();
            case "FIREFOX":
                return new FirefoxBrowser().getWebDriver();
            default:
                throw new InvalidArgumentException("Unsupported WebDriver");
        }
    }
}