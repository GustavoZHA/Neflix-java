package core.selenium;

public class WebDriverAction {
    private WebDriverManager driver;

    public WebDriverAction() {
        driver = WebDriverManager.getInstance();
    }

    public void navigate(String url) {
        driver.getWebDriver().get(url);
    }

    public String getTittle() {
        return driver.getWebDriver().getTitle();
    }

    public String getUrl() {
        return driver.getWebDriver().getCurrentUrl();
    }

    public void maximizeScreen() {
        driver.getWebDriver().manage().window().maximize();
    }
}
