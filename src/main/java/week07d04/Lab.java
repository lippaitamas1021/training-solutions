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
        this.completed = true;
        this.completedAt = completedAt;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }
    // állapot beállító metódus, nincs visszatérési értéke
    public void complete(LocalDate completedAt) {
        completed = true;
        this.completedAt = completedAt;
    }
    // állapot beállító metódus, nincs visszatérési értéke
    public void complete() {
        completed = true;
        completedAt = LocalDate.now();
    }
    // eredményt visszaadó metódus, van visszatérési értéke
    public boolean isTitleLongerThanTwoCharacters() {
        return title != null && title.length() > 2;
    }

    public String titleAndCompleted(String signIfCompleted, String signIfNotCompleted) {
        return title + " " + (completed ? signIfCompleted : signIfNotCompleted);
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
