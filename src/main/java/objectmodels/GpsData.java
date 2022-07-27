package objectmodels;

/**
 * 
 */
public class GpsData {
    private int altitude;
    private Number course;
    private String gpsTimeUtc;
    private Number latitude;
    private Number longitude;
    private Number speedMps;
    private boolean suppressed;
    private boolean valid;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Number getCourse() {
        return course;
    }

    public void setCourse(Number course) {
        this.course = course;
    }

    public String getGpsTimeUtc() {
        return gpsTimeUtc;
    }

    public void setGpsTimeUtc(String gpsTimeUtc) {
        this.gpsTimeUtc = gpsTimeUtc;
    }

    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }

    public Number getSpeedMps() {
        return speedMps;
    }

    public void setSpeedMps(Number speedMps) {
        this.speedMps = speedMps;
    }

    public boolean isSuppressed() {
        return suppressed;
    }

    public void setSuppressed(boolean suppressed) {
        this.suppressed = suppressed;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
