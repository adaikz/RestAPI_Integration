package authorization;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import usecases.PropertiesFile;

import java.io.IOException;
import java.util.Properties;
import static org.junit.Assert.*;

public class AuthorizationTest {

    private static AccessTokenObject accessTokenObject;
    private static final Properties properties = new PropertiesFile().getPropertiesFromResources();
    private static final Logger LOG = Logger.getLogger(AuthorizationTest.class);

    private final IAuthorization authorizationService = new AuthorizationService();


    @BeforeClass
    public static void beforeClass() {
        try {
            LOG.info("Before class");
            LOG.info("Authorization in progress.");
            AuthorizationService authorizationService = new AuthorizationService();
            accessTokenObject = authorizationService.getAccessTokenObject(properties);
        } catch (Exception e) {
            LOG.error("IOException during authorization:", e);
        }
    }

    @Test
    public void testGenerateToken() throws IOException {
        assertEquals("Bearer", accessTokenObject.getTokenType());
        assertEquals(3600000, accessTokenObject.getExpiresIn());
        assertNotNull(authorizationService.generateToken(properties));
        LOG.info("Token type: " + accessTokenObject.getTokenType());
        LOG.info("Expires in: " + accessTokenObject.getExpiresIn());
        LOG.info("Token: " + accessTokenObject.getAccessToken());
    }
}