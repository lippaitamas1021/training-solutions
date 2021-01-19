package activity;

public class Coordinate {       // immutable ez az osztály is
                                // String, Integer, Long, Double, Boolean, DigDecimal, BigInteger, LocalDate, LocalDateTime mind immutable osztályok
    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
