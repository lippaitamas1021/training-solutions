package activity;

public enum ActivityType {
    BIKING(true), HIKING(true), RUNNING(true), BASKETBALL(false);

    private boolean hasTrack;

    ActivityType(boolean hasTrack) {
        this.hasTrack = hasTrack;
    }

    public boolean HasTrack() {
        return hasTrack;
    }
}
