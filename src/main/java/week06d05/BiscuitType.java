package week06d05;

public enum BiscuitType {

    MILKA(50), KINDER(45), HIT(40);

    private final int gramAmount;

    BiscuitType(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public int getGramAmount() {
        return gramAmount;
    }
}
