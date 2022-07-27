package objectmodels;

/**
 * 
 */
public class Risk {
    private String assessedUtc;
    private String baseline;
    private String determination;
    private String expiryTimeUtc;
    private String increment;
    private int score;

    public String getAssessedUtc() {
        return assessedUtc;
    }

    public void setAssessedUtc(String assessedUtc) {
        this.assessedUtc = assessedUtc;
    }

    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public String getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public String getExpiryTimeUtc() {
        return expiryTimeUtc;
    }

    public void setExpiryTimeUtc(String expiryTimeUtc) {
        this.expiryTimeUtc = expiryTimeUtc;
    }

    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
