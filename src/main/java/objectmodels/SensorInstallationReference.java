package objectmodels;

/**
 * 
 */
public class SensorInstallationReference {
    private int id;
    private String installationUtc;
    private SensorBase sensor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstallationUtc() {
        return installationUtc;
    }

    public void setInstallationUtc(String installationUtc) {
        this.installationUtc = installationUtc;
    }

    public SensorBase getSensor() {
        return sensor;
    }

    public void setSensor(SensorBase sensor) {
        this.sensor = sensor;
    }
}
