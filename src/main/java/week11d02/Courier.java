package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (ride == null) {
            throw new IllegalArgumentException("Invalid ride");
        }
        if (rides.size() < 1) {
            // ride - elsőnek kell lennie
            rides.add(ride);
        } else {
            if (rides.get(rides.size() - 1).getDayNumber() > ride.getDayNumber()) {
                throw new IllegalArgumentException("Invalid day");
            }
            if (rides.get(rides.size() - 1).getDayNumber() == ride.getDayNumber()) {
                if (rides.get(rides.size() - 1).getRideNumber() + 1 != ride.getRideNumber()) {
                    throw new IllegalArgumentException("Invalid ride number");
                }
            }
            rides.add(ride);
        }
    }

    public int getEarliestHoliday() {
        for (int i = 1; i <= 7; i++) {
            for (Ride actual : rides) {
                if (i == actual.getDayNumber()) {
                    break;
                }
                return i;
            }
        }
        return -1;
    }
}
