package builder;


import objectmodels.FleetReference;
import objectmodels.VehicleTypeListItem;

/**
 * Vehicle entity builder
 */
public class VehicleType extends VehicleTypeListItem {
    private final int id;
    private final String name;
    private final String vehicleClassEnum;
    private final boolean enabled;
    private final FleetReference fleet;

    //constructor
    private VehicleType(VehicleTypeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.vehicleClassEnum = builder.vehicleClassEnum;
        this.enabled = builder.enabled;
        this.fleet = builder.fleet;
    }

    //Builder class
    public static final class VehicleTypeBuilder {
        private final int id;
        private final String name;
        private final String vehicleClassEnum;
        private final boolean enabled;
        private final FleetReference fleet;

        public VehicleTypeBuilder(int id, String name, String vehicleClassEnum, boolean enabled, FleetReference fleet) {
            this.id = id;
            this.name = name;
            this.vehicleClassEnum = vehicleClassEnum;
            this.enabled = enabled;
            this.fleet = fleet;
        }

        public VehicleType build() {
            return new VehicleType(this);
        }
    }

    //getters
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVehicleClassEnum() {
        return vehicleClassEnum;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public FleetReference getFleet() {
        return fleet;
    }

}
