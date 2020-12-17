package week08d01;

public class Robot {
    // végigmegyek a String-en és változtatom a koordinátákat (x, y)
    // F = y nő     L = y csökken   B = x csökken   J = x nő

    private Point position = new Point(0, 0);       // attribútumban tárolom az aktuális pozicióját és ezt változtatgatom

    public Point move(String movement) {
        movement = movement.toUpperCase();
        for (int i = 0; i < movement.length(); i++) {
            moveOneStep(movement.charAt(i));
        }
        return this.position;
    }

    private void moveOneStep(char letter) {         // String-et is lehet használni
        switch (letter) {
            case 'F' : {
                position.increaseY();
                return;                 // break is lehet return helyett
            }
            case 'L' : {
                position.decreaseY();
                return;
            }
            case 'J' : {
                position.increaseX();
                return;
            }
            case 'B' : {
                position.decreaseX();
                return;
            }
            default:
                throw new IllegalArgumentException("Unknown movement");
        }
    }

    public Point getPosition() {
        return position;
    }
}
