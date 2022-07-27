package usecases;

import authorization.AuthorizationService;
import builder.Account;
import builder.ShiftPattern;
import builder.Vehicle;
import builder.VehicleType;
import com.fasterxml.jackson.databind.ObjectMapper;
import objectmodels.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LoadGuardianData implements ILoadDataService {

    private static final Logger LOG = Logger.getLogger(LoadGuardianData.class);

    private final ObjectMapper mapper = new ObjectMapper();
    private final Properties properties = new PropertiesFile().getPropertiesFromResources();

    public LoadGuardianData() throws IOException {
    }

    @Override
    public List<AccountListItem> getAllAccounts() {
        List<AccountListItem> accounts = new ArrayList<>();
        try {
            AccountList accountList = mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllAccounts"))), AccountList.class);
            /*
              Using builder class to create each account entity looping through AccountList
              Use below code to create list of accounts directly without builder
               accounts.addAll(mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllAccounts"))), AccountList.class).getList());
             */
            for(AccountListItem a: accountList.getList()) {
                Account accountItem = new Account.AccountBuilder(a.getId(), a.getName(), a.isEnabled(), a.getServiceProvider(), a.getServiceProviderId())
                        .build();
                accounts.add(accountItem);
            }
        } catch (IOException e) {
            LOG.error("Exception during fetching list of all accounts:", e);
        }
        return accounts;
    }

    @Override
    public List<VehicleListItem> getAllVehicles() {
        List<VehicleListItem> vehicles = new ArrayList<>();
        try {
            VehicleList vehicleList = mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllVehicles"))), VehicleList.class);
            for(VehicleListItem v: vehicleList.getList()) {
                Vehicle vehicleItem = new Vehicle.VehicleBuilder(v.getId(), v.getName(), v.getContactState(), v.getContactTimeUtc(), v.isEnabled(), v.getEquipmentState(), v.getFleet(), v.getGroup(), v.getLocation(), v.getOperator(), v.getRisk(), v.getSensorInstallation(), v.getSensorState(), v.getShiftStatistics(), v.getSoftwareVersion(), v.getStatus(), v.getSystemTimeUtc(), v.getTripStatistics(), v.getType())
                        .build();
                vehicles.add(vehicleItem);
            }
        } catch (IOException e) {
            LOG.error("Exception during fetching list of all vehicles:", e);
        }
        return vehicles;
    }

    @Override
    public List<VehicleTypeListItem> getAllVehicleTypes() {
        List<VehicleTypeListItem> vehicleTypes = new ArrayList<>();
        try {
            VehicleTypeList vehicleTypeList = mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllVehicleTypes"))), VehicleTypeList.class);
            for(VehicleTypeListItem v: vehicleTypeList.getList()) {
                VehicleType vehicleTypeItem = new VehicleType.VehicleTypeBuilder(v.getId(), v.getName(), v.getVehicleClassEnum(), v.isEnabled(), v.getFleet())
                        .build();
                vehicleTypes.add(vehicleTypeItem);
            }
        } catch (IOException e) {
            LOG.error("Exception during fetching list of all vehicle types:", e);
        }

        return vehicleTypes;
    }

    @Override
    public List<ShiftPatternListItem> getAllShiftPatterns() {
        List<ShiftPatternListItem> shiftPatterns = new ArrayList<>();
        try {
            shiftPatterns.addAll(mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllShiftPatterns"))), ShiftPatternList.class).getList());
            ShiftPatternList shiftPatternList = mapper.readValue(getJsonResponse(new HttpGet(properties.getProperty("getAllShiftPatterns"))), ShiftPatternList.class);
            for(ShiftPatternListItem s: shiftPatternList.getList()) {
                ShiftPattern shiftPatternItem = new ShiftPattern.ShiftPatternBuilder(s.getId(), s.getName(), s.isActivePattern(), s.getEffectiveDate(), s.getEndDate(), s.getFleet())
                        .build();
                shiftPatterns.add(shiftPatternItem);
            }
        } catch (IOException e) {
            LOG.error("Exception during fetching list of all shift patterns:", e);
        }
        return shiftPatterns;
    }

    private String getJsonResponse(HttpGet get) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        CloseableHttpClient closeableHttpClient = null;
        AuthorizationService authorizationService = new AuthorizationService();
        String authToken = authorizationService.getAccessTokenObject(properties).getAccessToken();
        try {
            get.addHeader("Accept", "application/json");
            get.addHeader("Authorization", "Bearer " + authToken);
            closeableHttpClient = HttpClients.createDefault();
            HttpResponse response = closeableHttpClient.execute(get);
            String line;
            inputStreamReader = new InputStreamReader(response.getEntity().getContent(), StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);
            while ((line = bufferedReader.readLine()) != null)
                sb.append(line);
        } catch (Exception e) {
            LOG.error("IOException during getting json response via http:", e);
        } finally {
            if(inputStreamReader != null) inputStreamReader.close();
            if(bufferedReader != null) bufferedReader.close();
            if(closeableHttpClient != null )closeableHttpClient.close();
        }
        System.out.println("JSON RESPONSE IS::: " + sb.toString());
        return sb.toString();
    }

}
