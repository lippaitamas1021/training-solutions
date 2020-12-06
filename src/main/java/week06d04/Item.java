package week06d04;

import java.time.LocalDate;

public class Item {

    private int price;
    private LocalDate date;
    private String name;
    private int month;

    public Item(int price, int year, int month, int day, String name) {
        if (price <= 0) {
            throw new IllegalArgumentException("Wrong price");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't stay blank");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        this.price = price;
        date = LocalDate.of(year, month, day);
        this.name = name;
    }

    public Item(int price, LocalDate date, String name) {
        this.price = price;
        this.date = date;
        this.name = name;
    }

    public Item(int price, String name, int month) {
        this.price = price;
        this.name = name;
        this.month = month;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
