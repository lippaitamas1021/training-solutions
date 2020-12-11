package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        completed = true;
        this.completedAt = completedAt;
    }

    public void complete(LocalDate localDate) {
        completed = true;
        localDate = completedAt;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Elvégzett feladat: " + title + '\'' + ", Státusza: " + completed + ", Időpont: " + completedAt + "." ;}



    public static void main(String[] args) {
        Lab lab = new Lab("Gyakorlás");
        lab.complete();
        System.out.println(lab.toString());
    }
}
