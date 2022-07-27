package objectmodels;

public class ShiftStatistics {
    private Number averageSpeedMps;
    private int distanceTravelledMetres;
    private String endTimeUtc;
    private Number gpsPercent;
    private Number maximumSpeedMps;
    private int operatingTimeMinutes;
    private String startTimeUtc;
    private int stationaryTimeMinutes;
    private Number trackPerformance;

    public Number getAverageSpeedMps() {
        return averageSpeedMps;
    }

    public int getDistanceTravelledMetres() {
        return distanceTravelledMetres;
    }

    public String getEndTimeUtc() {
        return endTimeUtc;
    }

    public Number getGpsPercent() {
        return gpsPercent;
    }

    public Number getMaximumSpeedMps() {
        return maximumSpeedMps;
    }

    public int getOperatingTimeMinutes() {
        return operatingTimeMinutes;
    }

    public String getStartTimeUtc() {
        return startTimeUtc;
    }

    public int getStationaryTimeMinutes() {
        return stationaryTimeMinutes;
    }

    public Number getTrackPerformance() {
        return trackPerformance;
    }

    public void setAverageSpeedMps(Number averageSpeedMps) {
        this.averageSpeedMps = averageSpeedMps;
    }

    public void setDistanceTravelledMetres(int distanceTravelledMetres) {
        this.distanceTravelledMetres = distanceTravelledMetres;
    }

    public void setEndTimeUtc(String endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
    }

    public void setGpsPercent(Number gpsPercent) {
        this.gpsPercent = gpsPercent;
    }

    public void setMaximumSpeedMps(Number maximumSpeedMps) {
        this.maximumSpeedMps = maximumSpeedMps;
    }

    public void setOperatingTimeMinutes(int operatingTimeMinutes) {
        this.operatingTimeMinutes = operatingTimeMinutes;
    }

    public void setStartTimeUtc(String startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public void setStationaryTimeMinutes(int stationaryTimeMinutes) {
        this.stationaryTimeMinutes = stationaryTimeMinutes;
    }

    public void setTrackPerformance(Number trackPerformance) {
        this.trackPerformance = trackPerformance;
    }
}
