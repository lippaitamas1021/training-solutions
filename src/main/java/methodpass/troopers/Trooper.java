package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("A név mező kitöltése kötelező");
        }
        this.name = name;
        this.position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position position) {
       if (position == null) {
           throw new IllegalArgumentException("Az új pozíció kitöltése kötelező");
       }
        this.position = position;
    }

    public double distanceFrom(Position position) {
        return this.position.distanceFrom(position);
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
