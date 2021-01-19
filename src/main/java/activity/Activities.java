package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();      // felesleges a példányosítás, mert konstruktorban kap értéket ez az attribútum, tehát felül lesz írva példányosításkor

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {      // az instanceof használatával tudom eldönteni, hogy WithTrack vagy WithoutTrack
        int counter = 0;                        // kerüljük az instanceof-ot, mert hibázhat és tervezési hibára utal
        for (Activity activity : activities) {  // kerüljük a static-ot, amennyire lehet
            if (activity instanceof ActivityWithTrack) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (!activity.hasTRack()) {
                counter++;
            }
        }
        return counter;
    }

    public List<Report> distancesByTypes() {
        double[] sum = new double[ActivityType.values().length];
        for (Activity activity : activities) {
            sum[activity.getType().ordinal()] += activity.getDistance();
        }
        List<Report> result = new ArrayList<>();
        for (ActivityType activityType : ActivityType.values()) {
            result.add(new Report(activityType, sum[activityType.ordinal()]));
        }
        return result;
    }
}
