package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (hour < 0 || 23 < hour) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour;
        if (minute < 0 || 59 < minute) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = minute;
    }

    public SimpleTime(String timeStr) {
        if (timeStr == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (timeStr.length() != "hh:mm".length() || timeStr.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int hour2;
        try {
            hour2 = Integer.parseInt(timeStr.substring(0, 2));
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int minute2;
        try {
            minute2 = Integer.parseInt(timeStr.substring(3));
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        if (hour2 < 0 || 23 < hour2) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour2;
        if (minute2 < 0 || 59 < minute2) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = minute2;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}
