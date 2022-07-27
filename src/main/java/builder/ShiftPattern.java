package builder;

import objectmodels.FleetReference;
import objectmodels.ShiftPatternListItem;

/**
 * ShiftPattern entity builder
 */
public class ShiftPattern extends ShiftPatternListItem {
    private final int id;
    private final String name;
    private final boolean activePattern;
    private final String effectiveDate;
    private final String endDate;
    private final FleetReference fleet;

    //constructor
    private ShiftPattern(ShiftPatternBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.activePattern = builder.activePattern;
        this.effectiveDate = builder.effectiveDate;
        this.endDate = builder.endDate;
        this.fleet = builder.fleet;
    }

    //Builder class
    public static final class ShiftPatternBuilder {
        private final int id;
        private final String name;
        private final boolean activePattern;
        private final String effectiveDate;
        private final String endDate;
        private final FleetReference fleet;

        public ShiftPatternBuilder(int id, String name, boolean activePattern, String effectiveDate, String endDate, FleetReference fleet) {
            this.id = id;
            this.name = name;
            this.activePattern = activePattern;
            this.effectiveDate = effectiveDate;
            this.endDate = endDate;
            this.fleet = fleet;
        }

        public ShiftPattern build() {
            return new ShiftPattern(this);
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
    public boolean isActivePattern() {
        return activePattern;
    }

    @Override
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @Override
    public String getEndDate() {
        return endDate;
    }

    @Override
    public FleetReference getFleet() {
        return fleet;
    }
}
