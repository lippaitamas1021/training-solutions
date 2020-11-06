package Week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    @Override
    public String toString() {
        return "Languages{}";
    }

    public static void main(String[] args) {
        List<String> iTlanguages = new ArrayList<>();

        iTlanguages.add("Java");
        iTlanguages.add("Python");
        iTlanguages.add("JavaScript");


        for (String lang : iTlanguages) {
            if (lang.length() > 5) {
                System.out.println(lang);
            }
        }
    }
}
