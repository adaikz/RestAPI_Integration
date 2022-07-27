package builder;

import objectmodels.AccountListItem;
import objectmodels.ShiftPatternListItem;
import objectmodels.VehicleListItem;
import objectmodels.VehicleTypeListItem;

import java.util.List;

/**
 * Builder class for building API object models. Object models can be created one by one or altogether.
 */
public class GuardianDataBuilder {

    private final List<AccountListItem> accounts;
    private final List<VehicleListItem> vehicles;
    private final List<VehicleTypeListItem> vehicleTypes;
    private final List<ShiftPatternListItem> shiftPatterns;

    //constructor
    private GuardianDataBuilder(Builder builder) {
        this.accounts = builder.accounts;
        this.vehicles = builder.vehicles;
        this.vehicleTypes = builder.vehicleTypes;
        this.shiftPatterns = builder.shiftPatterns;
    }

    //builder
    public static class Builder {
        private List<AccountListItem> accounts;
        private List<VehicleListItem> vehicles;
        private List<VehicleTypeListItem> vehicleTypes;
        private List<ShiftPatternListItem> shiftPatterns;

        public Builder setAccounts(List<AccountListItem> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder setVehicles(List<VehicleListItem> vehicles) {
            this.vehicles = vehicles;
            return this;
        }
        public Builder setVehicleTypes(List<VehicleTypeListItem> vehicleTypes) {
            this.vehicleTypes = vehicleTypes;
            return this;
        }
        public Builder setShiftPatterns(List<ShiftPatternListItem> shiftPatterns) {
            this.shiftPatterns = shiftPatterns;
            return this;
        }

        public GuardianDataBuilder build() {
            return new GuardianDataBuilder(this);
        }

    }

    //getters
    public List<AccountListItem> getAccounts() {
        return accounts;
    }

    public List<VehicleListItem> getVehicles() {
        return vehicles;
    }

    public List<VehicleTypeListItem> getVehicleTypes() {
        return vehicleTypes;
    }

    public List<ShiftPatternListItem> getShiftPatterns() {
        return shiftPatterns;
    }
}
