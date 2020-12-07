package week06d05;

public class Biscuit {

    public BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type) {
       this(type, type.getGramAmount());
    }

    public Biscuit(BiscuitType type, int gramAmount) {
        if (type == null) {
            throw new IllegalArgumentException("Invalid type");
        }
        if (gramAmount <= 0) {
            throw new IllegalArgumentException("Invalid gram amount");
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }
}
