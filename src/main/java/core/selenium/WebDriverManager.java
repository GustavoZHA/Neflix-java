package core.selenium;

import core.EnvConfig;
import core.selenium.driver.WebDriverFactory;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WebDriverManager {
    @Getter
    private WebDriver webDriver;
    @Getter
    private WebDriverWait wait;
    private static WebDriverManager instance;
    private final EnvConfig envConfig;

    public WebDriverManager() {
        envConfig = new EnvConfig();
        initialize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize(){
        webDriver = WebDriverFactory.getDriver(envConfig.getBrowser());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(envConfig.getImplicitTime()));
        wait = new WebDriverWait(webDriver, Duration.ofMillis(envConfig.getExplicitTime()));
    }
}
