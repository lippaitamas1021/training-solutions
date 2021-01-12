package week03d02;

import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "" + name + " bónusza " + bonus + " Ft";
    }

    public static void main(String[] args) {
        List<Position> positions = List.of(
                new Position("Tamás", 100_000),
                new Position("József", 150_000),
                new Position("Zebulon", 200_000));

        for (Position position : positions) {
            if (150000 <= position.bonus) {
                System.out.println(position);
            }
        }
    }
}
