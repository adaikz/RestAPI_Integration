package usecases;

import objectmodels.*;
import java.util.List;

/**
 * Load assets data from endpoints
 */
public interface ILoadDataService {

    /**
     *
     * @return list of all Account
     */
    List<AccountListItem> getAllAccounts();

    /**
     *
     * @return list of all Vehicles
     */
    List<VehicleListItem> getAllVehicles();

    /**
     *
     * @return list of all Vehicle Types
     */
    List<VehicleTypeListItem> getAllVehicleTypes();

    /**
     *
     * @return list of all Shift Patterns
     */
    List<ShiftPatternListItem> getAllShiftPatterns();

}