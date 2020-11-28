package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate expDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        expDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpdate() {
        return expDate;
    }

    public boolean isExpired() {
        if (expDate.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
