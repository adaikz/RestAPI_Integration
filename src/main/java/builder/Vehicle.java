package builder;


import objectmodels.*;

/**
 * Vehicle entity builder
 */
public class Vehicle extends VehicleListItem {
    private final int id;
    private final String name;
    private final String contactState;
    private final String contactTimeUtc;
    private final boolean enabled;
    private final String equipmentState;
    private final FleetReference fleet;
    private final VehicleGroupBase group;
    private final GpsData location;
    private final OperatorBase operator;
    private final Risk risk;
    private final SensorInstallationReference sensorInstallation;
    private final String sensorState;
    private final ShiftStatistics shiftStatistics;
    private final String softwareVersion;
    private final String[] status;
    private final String systemTimeUtc;
    private final TripStatistics tripStatistics;
    private final VehicleTypeBase type;

    //constructor
    private Vehicle(VehicleBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.contactState = builder.contactState;
        this.contactTimeUtc = builder.contactTimeUtc;
        this.enabled = builder.enabled;
        this.equipmentState = builder.equipmentState;
        this.fleet = builder.fleet;
        this.group = builder.group;
        this.location = builder.location;
        this.operator = builder.operator;
        this.risk = builder.risk;
        this.sensorInstallation = builder.sensorInstallation;
        this.sensorState = builder.sensorState;
        this.shiftStatistics = builder.shiftStatistics;
        this.softwareVersion = builder.softwareVersion;
        this.status = builder.status;
        this.systemTimeUtc = builder.systemTimeUtc;
        this.tripStatistics = builder.tripStatistics;
        this.type = builder.type;
    }

    //Builder class
    public static final class VehicleBuilder {
        private final int id;
        private final String name;
        private final String contactState;
        private final String contactTimeUtc;
        private final boolean enabled;
        private final String equipmentState;
        private final FleetReference fleet;
        private final VehicleGroupBase group;
        private final GpsData location;
        private final OperatorBase operator;
        private final Risk risk;
        private final SensorInstallationReference sensorInstallation;
        private final String sensorState;
        private final ShiftStatistics shiftStatistics;
        private final String softwareVersion;
        private final String[] status;
        private final String systemTimeUtc;
        private final TripStatistics tripStatistics;
        private final VehicleTypeBase type;

        public VehicleBuilder(int id, String name, String contactState, String contactTimeUtc, boolean enabled, String equipmentState, FleetReference fleet, VehicleGroupBase group, GpsData location, OperatorBase operator, Risk risk, SensorInstallationReference sensorInstallation, String sensorState, ShiftStatistics shiftStatistics, String softwareVersion, String[] status, String systemTimeUtc, TripStatistics tripStatistics, VehicleTypeBase type) {
            this.id = id;
            this.name = name;
            this.contactState = contactState;
            this.contactTimeUtc = contactTimeUtc;
            this.enabled = enabled;
            this.equipmentState = equipmentState;
            this.fleet = fleet;
            this.group = group;
            this.location = location;
            this.operator = operator;
            this.risk = risk;
            this.sensorInstallation = sensorInstallation;
            this.sensorState = sensorState;
            this.shiftStatistics = shiftStatistics;
            this.softwareVersion = softwareVersion;
            this.status = (String[])status.clone();
            this.systemTimeUtc = systemTimeUtc;
            this.tripStatistics = tripStatistics;
            this.type = type;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactState() {
        return contactState;
    }

    public String getContactTimeUtc() {
        return contactTimeUtc;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getEquipmentState() {
        return equipmentState;
    }

    public FleetReference getFleet() {
        return fleet;
    }

    public VehicleGroupBase getGroup() {
        return group;
    }

    public GpsData getLocation() {
        return location;
    }

    public OperatorBase getOperator() {
        return operator;
    }

    public Risk getRisk() {
        return risk;
    }

    public SensorInstallationReference getSensorInstallation() {
        return sensorInstallation;
    }

    public String getSensorState() {
        return sensorState;
    }

    public ShiftStatistics getShiftStatistics() {
        return shiftStatistics;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public String[] getStatus() {
        return (String[])status.clone();
    }

    public String getSystemTimeUtc() {
        return systemTimeUtc;
    }

    public TripStatistics getTripStatistics() {
        return tripStatistics;
    }

    public VehicleTypeBase getType() {
        return type;
    }

}
