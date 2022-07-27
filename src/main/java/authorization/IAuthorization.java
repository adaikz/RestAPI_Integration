package authorization;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * AuthorizationService object is the token returned from API with 3 fields: access_token, expires_in, token_type
 */
public interface IAuthorization {

    /**
     *
     * @param properties properties file to get credentials
     * @return AccessTokenObject
     */
    AccessTokenObject getAccessTokenObject(Properties properties) throws IOException;

    /**
     * generate new AccessToken object and return accessToken field from it
     * @param properties properties file to get credentials
     * @return Bearer Token as String
     */
    String generateToken(Properties properties) throws IOException;

}
