package core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private Properties properties;

    public PropertiesReader(String path) {
        properties = new Properties();
        propertiesReader(path);
    }

    private void propertiesReader(final String path) {
        try {
            InputStream inputStream = new FileInputStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("File not found or Unable to read the properties file (.properties)", e);
        }
    }

    public String getProperty(final String property) {
        return properties.getProperty(property);
    }
}
