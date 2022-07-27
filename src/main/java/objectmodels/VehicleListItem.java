package objectmodels;

/**
 * 
 */
public class VehicleListItem {
    private int id;
    private String name;
    private String contactState;
    private String contactTimeUtc;
    private boolean enabled;
    private String equipmentState;
    private FleetReference fleet;
    private VehicleGroupBase group;
    private GpsData location;
    private OperatorBase operator;
    private Risk risk;
    private SensorInstallationReference sensorInstallation;
    private String sensorState;
    //new fields added:
    private ShiftStatistics shiftStatistics;
    private String softwareVersion;
    private String[] status;
    private String systemTimeUtc;
    private TripStatistics tripStatistics;
    /*--------------------------------------*/
    private VehicleTypeBase type;


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

    public VehicleTypeBase getType() {
        return type;
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

}
