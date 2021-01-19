package activity;

public class TrackPoint {       // útvonalpont, ez annyival több, mint a koordináta, hogy van benne magasság paraméter is
    // a koordinátán és magasságon kívül még az időpontot, szívverési számot szokták eltárolni
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint trackPoint) {      // 2 pont közötti távolságot hasonlít össze, az egyik a paraméter, a másik, amin meghívom a metódust
        // azért van itt és nem a koordinátában, mert térben gondolkodunk, azaz számít a magasság is, az pedig a koordinátában nincs benne
        final int radiusOFEarth = 6371;                         // távolságmérés a gömb felületén
        final double thisLatitude = coordinate.getLatitude();
        final double thisLongitude = coordinate.getLongitude();
        final double otherLatitude = trackPoint.getCoordinate().getLatitude();
        final double otherLongitude = trackPoint.getCoordinate().getLongitude();

        Double latitudeDistance = Math.toRadians(otherLatitude - thisLatitude);
        Double longitudeDistance = Math.toRadians(otherLongitude - thisLongitude);
        Double a = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2)
                + Math.cos(Math.toRadians(thisLatitude)) * Math.cos(Math.toRadians(otherLatitude))
                * Math.sin(longitudeDistance / 2) * Math.sin(longitudeDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = radiusOFEarth * c * 1000;

        double height = this.getElevation() - trackPoint.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    public boolean higherThan(TrackPoint anotherTrackPoint) {
        return elevation > anotherTrackPoint.elevation;
    }

    public double elevationDifference(TrackPoint anotherTrackPoint) {
        return Math.abs(anotherTrackPoint.elevation - elevation);                 // mivel egy osztályban van a metódus és az attribútum, nem kell gettert meghívni, hanem az attribútum nevét is elég leírni
    }
}
