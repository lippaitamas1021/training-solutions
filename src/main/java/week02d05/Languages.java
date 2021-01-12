package week02d05;

import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> languages = List.of("Java", "Python", "JavScript");
        for (String language : languages) {
            if (5 < language.length()) {
                System.out.println(language);
            }
        }
    }
}