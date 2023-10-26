package core;

import core.utils.PropertiesReader;
import lombok.AccessLevel;
import lombok.Getter;

@Getter
public class EnvConfig {
    @Getter(AccessLevel.NONE)
    private PropertiesReader properties;
    private String browser;
    private int implicitTime;
    private int explicitTime;
    private String baseUrl;

     public EnvConfig() {
         properties = new PropertiesReader("Config.properties");
         getEnvironmentProperties();
    }

    private void getEnvironmentProperties() {
        browser = properties.getProperty("browser");
        implicitTime = Integer.parseInt(properties.getProperty("implicitTime"));
        explicitTime = Integer.parseInt(properties.getProperty("explicitTime"));
        baseUrl = properties.getProperty("BASEURL");
    }
}
