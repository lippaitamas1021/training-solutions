package week13d04;

import java.time.LocalDate;

public class TemperatureAtDay {

    private LocalDate day;
    private double temperature;

    public TemperatureAtDay(LocalDate day, double temperature) {
        this.day = day;
        this.temperature = temperature;
    }

    public LocalDate getDay() {
        return day;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override                           // override helyett le kell generáltatni az IDEA-val és ugyanúgy működik
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof TemperatureAtDay)) {   //classCastException-t is le kell kezelni, mert a felhasználó más típust is megadhat, pl. String-et
            return false;
        }
        TemperatureAtDay another = (TemperatureAtDay) obj;      // cast-olás
        return this.day != null && this.day.equals(another.day) && this.temperature == another.temperature;
    }

    public static void main(String[] args) {
        TemperatureAtDay temp1 = new TemperatureAtDay(LocalDate.of(2011,1,1), -1);
        TemperatureAtDay temp2 = new TemperatureAtDay(LocalDate.of(2012,1,1), -2);
        TemperatureAtDay temp3 = new TemperatureAtDay(LocalDate.of(2011,1,1), -1);
        System.out.println(temp1.equals(temp2));
        System.out.println(temp1.equals(temp3));

    }
}
