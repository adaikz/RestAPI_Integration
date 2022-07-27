package objectmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class VehicleTypeListItem {
    private int id;
    private String name;
    //use @JsonProperty annotation to replace "class" key coming from json response to vehicleClassEnum variable
    @JsonProperty(value = "class")
    private String vehicleClassEnum;
    private boolean enabled;
    private FleetReference fleet;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleClassEnum() {
        return vehicleClassEnum;
    }

    public void setVehicleClassEnum(String vehicleClassEnum) {
        this.vehicleClassEnum = vehicleClassEnum;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public FleetReference getFleet() {
        return fleet;
    }

    public void setFleet(FleetReference fleet) {
        this.fleet = fleet;
    }
}
