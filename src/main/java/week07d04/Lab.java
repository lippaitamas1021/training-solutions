package week07d04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        completed = true;
        this.completedAt = completedAt;
    }

    public void complete(LocalDateTime localDateTime) {
        completed = true;
        localDateTime = completedAt;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Elvégzett feladat: " + title + ", Státusza: " + completed + ", Időpont: " + completedAt.toString() + "." ;}



    public static void main(String[] args) {
        Lab lab = new Lab("Gyakorlás");
        lab.complete();
        System.out.println(lab.toString());
    }
}
