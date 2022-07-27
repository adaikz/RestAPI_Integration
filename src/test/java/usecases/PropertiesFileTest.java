package usecases;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;
import static org.junit.Assert.*;

public class PropertiesFileTest {

    private Properties propertiesFromResources;
    private Properties propertiesFromFile;

    @Before
    public void before() throws IOException {
        PropertiesFile propertiesFileClass = new PropertiesFile();
        propertiesFromResources = propertiesFileClass.getPropertiesFromResources();
        propertiesFromFile = propertiesFileClass.getPropertiesFromFile();
    }

    @Test
    public void testGetPropertyFromResources() {
        assertEquals("client_credentials", propertiesFromResources.getProperty("grant_type"));
        assertEquals("", propertiesFromResources.getProperty("authorization"));
    }

    @Test
    public void testGetPropertyFromFile() {
        assertEquals("client_credentials", propertiesFromFile.getProperty("grant_type"));
        assertEquals("", propertiesFromFile.getProperty("authorization"));
    }
}