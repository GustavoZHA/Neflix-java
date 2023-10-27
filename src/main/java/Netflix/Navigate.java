package Netflix;

import core.EnvConfig;
import core.selenium.WebDriverAction;

public class Navigate {
    private WebDriverAction action = new WebDriverAction();
    private EnvConfig env = new EnvConfig();

    public void navigateHomePage() {
        action.navigate(env.getBaseUrl());
    }
}
