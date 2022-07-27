package usecases;

import objectmodels.*;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import static org.junit.Assert.*;

public class LoadGuardianDataTest {

    private static final Logger LOG = Logger.getLogger(LoadGuardianDataTest.class);

    private final ILoadDataService loadGuardianData = new LoadGuardianData();

    public LoadGuardianDataTest() throws IOException {
    }

    @BeforeClass
    public static void beforeClass() {
        LOG.info("Testing Guardian use cases.");
    }

    @Test
    public void listAllAccounts() {
        List<AccountListItem> accounts = loadGuardianData.getAllAccounts();
        assertTrue("Account list is empty.", !accounts.isEmpty() );
        LOG.info("LIST OF ALL ACCOUNTS:");
        for (AccountListItem a : accounts)
            LOG.info(a.getId() + " " + a.getName() + " " + a.getServiceProvider());
        LOG.info("===============================================================================");
    }

    @Test
    public void getAllVehicles() {
        List<VehicleListItem> vehicles = loadGuardianData.getAllVehicles();
        assertTrue("Vehicles list is empty.", !vehicles.isEmpty() );
        LOG.info("LIST OF ALL VEHICLES:");
        for (VehicleListItem v : vehicles)
            LOG.info(v.getId() + " " + v.getName() + " " + v.getContactTimeUtc());
        LOG.info("===============================================================================");
    }

    @Test
    public void getAllVehicleTypes() {
        List<VehicleTypeListItem> vehicleTypes = loadGuardianData.getAllVehicleTypes();
        assertTrue("Vehicle type list is empty.", !vehicleTypes.isEmpty() );
        LOG.info("LIST OF ALL VEHICLE TYPES:");
        for (VehicleTypeListItem v : vehicleTypes)
            LOG.info(v.getId() + " " + v.getName() + " " + v.getVehicleClassEnum());
        LOG.info("===============================================================================");
    }

    @Test
    public void getAllShiftPatterns() {
        List<ShiftPatternListItem> shifts = loadGuardianData.getAllShiftPatterns();
        assertTrue("Shift patterns list is empty.", !shifts.isEmpty() );
        LOG.info("LIST OF ALL SHIFT PATTERNS:");
        for (ShiftPatternListItem s : shifts)
            LOG.info(s.getId() + " " + s.getName());
        LOG.info("===============================================================================");
    }
}