package usecases;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties file loader factory class. Use this class as single point for loading properties files.
 */
public class PropertiesFile {

    private static final Logger LOG = Logger.getLogger(PropertiesFile.class.getName());
    private final Properties properties;

    public PropertiesFile() {
        this.properties = new Properties();
    }

    //method to load properties from any file
    public Properties getPropertiesFromFile() throws IOException {
        FileInputStream fis = null;
        String filePath = "src\\main\\resources\\apiConfigs.properties";
        try {
            fis = new FileInputStream(filePath);
            properties.load(fis);
        } catch(Exception e) {
            LOG.error("Exception while loading properties from file + " + filePath + ": " + e);
        } finally {
            if (fis != null) fis.close();
        }
        return properties;
    }

    //method to load properties from file in project resources folder.
    public Properties getPropertiesFromResources() {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("apiConfigs.properties"));
        } catch(IOException e) {
            LOG.error("Exception while loading properties from resources: " + e);
        }
        return properties;
    }
}
