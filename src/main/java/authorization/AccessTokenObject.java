package authorization;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * AccessTokenObject object with 3 fields from JSON response: accessToken, expiresIn, tokenType
 */
public class AccessTokenObject {

    //@JsonProperty annotation to replace JSON keys with camelcase names for variables
    @JsonProperty(value = "access_token")
    private String accessToken;
    @JsonProperty(value = "expires_in")
    private int expiresIn;
    @JsonProperty(value = "token_type")
    private String tokenType;

    public AccessTokenObject() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
