package objectmodels;

/**
 * 
 */
public class ShiftPatternListItem {
    private int id;
    private String name;
    private boolean activePattern;
    private String effectiveDate;
    private String endDate;
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

    public boolean isActivePattern() {
        return activePattern;
    }

    public void setActivePattern(boolean activePattern) {
        this.activePattern = activePattern;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public FleetReference getFleet() {
        return fleet;
    }

    public void setFleet(FleetReference fleet) {
        this.fleet = fleet;
    }
}
