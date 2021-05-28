package week16d01;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CanoeRental {

    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, String dateTimeString) {
        this.name = name;
        this.canoeType = canoeType;
        dateTimeString = String.valueOf(ChronoUnit.DAYS.between(this.endTime, this.startTime));
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        return 0;
    }

    public boolean isActive() {
        if (endTime.isAfter(startTime)) {
            return true;
        } else {
            return false;
        }
    }
}
