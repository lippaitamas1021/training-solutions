package methodoverloading.pub;

import methodoverloading.Time;

public class Pub {

    private String name;
    private Time openingTime;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.openingTime = new Time(hours, minutes);
    }

    public String getName() {
        return name;
    }

    public Time getOpeningTime() {
        return openingTime;
    }

    @Override
    public String toString() {
        return name + ";" + openingTime.getHours() + ":" + openingTime.getMinutes();
    }
}

