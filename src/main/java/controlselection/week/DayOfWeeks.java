package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day) {

        switch (day.toLowerCase()) {
            case "hétfő" : return "hét eleje";
            case "kedd", "szerda", "csütörtök" : return "hét közepe";
            case "péntek" : return "majdnem hétvége";
            case "szombat", "vasárnap" : return  "hétvége";
            default: throw new IllegalArgumentException("nincs ilyen nap!");
        }
    }

}
