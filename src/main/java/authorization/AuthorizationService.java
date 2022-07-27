package authorization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import usecases.PropertiesFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

/**
 *
 * Provide authorization to API
 */
public class AuthorizationService implements IAuthorization {

    private static final Logger LOG = Logger.getLogger(AuthorizationService.class);

    @Override
    public AccessTokenObject getAccessTokenObject(Properties properties) throws IOException {
        AccessTokenObject accessTokenObject = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        CloseableHttpClient closeableHttpClient = null;
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            properties = new PropertiesFile().getPropertiesFromResources();
            closeableHttpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(properties.getProperty("authorization"));
            List<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("grant_type", properties.getProperty("grant_type")));
            nameValuePairs.add(new BasicNameValuePair("client_id", properties.getProperty("client_id")));
            nameValuePairs.add(new BasicNameValuePair("client_secret", properties.getProperty("client_secret")));
            nameValuePairs.add(new BasicNameValuePair("scope", properties.getProperty("scope")));

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            closeableHttpResponse = closeableHttpClient.execute(httpPost); //executing the POST request to Guardian for getting access token
            inputStreamReader = new InputStreamReader(closeableHttpResponse.getEntity().getContent(), StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
            LOG.info("The json response is: " + sb.toString());
            ObjectMapper mapper = new ObjectMapper();
            accessTokenObject = mapper.readValue(sb.toString(), AccessTokenObject.class);
        } catch (Exception e) {
            LOG.error("IOException during authorization:", e);
        } finally {
            if(inputStreamReader != null) inputStreamReader.close();
            if(bufferedReader != null) bufferedReader.close();
            if(closeableHttpClient != null )closeableHttpClient.close();
            if(closeableHttpResponse != null) closeableHttpResponse.close();

        }
        return Objects.requireNonNull(accessTokenObject);
    }

    @Override
    public String generateToken(Properties properties) throws IOException {
        AccessTokenObject accessTokenObject = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        CloseableHttpClient closeableHttpClient = null;
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            properties = new PropertiesFile().getPropertiesFromResources();
            closeableHttpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(properties.getProperty("authorization"));
            List<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("grant_type", properties.getProperty("grant_type")));
            nameValuePairs.add(new BasicNameValuePair("client_id", properties.getProperty("client_id")));
            nameValuePairs.add(new BasicNameValuePair("client_secret", properties.getProperty("client_secret")));
            nameValuePairs.add(new BasicNameValuePair("scope", properties.getProperty("scope")));

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            closeableHttpResponse = closeableHttpClient.execute(httpPost); //executing the POST request to API for getting access token
            inputStreamReader = new InputStreamReader(closeableHttpResponse.getEntity().getContent(), StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
            LOG.info("The json response is: " + sb.toString());
            ObjectMapper mapper = new ObjectMapper();
            accessTokenObject = mapper.readValue(sb.toString(), AccessTokenObject.class);
        } catch (Exception e) {
            LOG.error("IOException during authorization:", e);
        } finally {
            if(inputStreamReader != null) inputStreamReader.close();
            if(bufferedReader != null) bufferedReader.close();
            if(closeableHttpClient != null )closeableHttpClient.close();
            if(closeableHttpResponse != null) closeableHttpResponse.close();

        }
        return Objects.requireNonNull(accessTokenObject).getAccessToken();
    }

}
