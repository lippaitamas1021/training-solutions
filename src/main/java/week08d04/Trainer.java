package week08d04;

public class Trainer {

    private int CanMark;

    public Trainer(int canMark) {
        CanMark = canMark;
    }

    /*public int giveMark() {

    }
    Nem értem a kifejezést, hogy ez a metódus továbbhív, azaz "delegál" a CanMark példány felé.
     */

    public static void main(String[] args) {
        GoodMood trainer = new GoodMood();
        BadMood trainer2 = new BadMood();

        System.out.println(trainer.giveMark());
        System.out.println(trainer2.giveMark());
    }
}
