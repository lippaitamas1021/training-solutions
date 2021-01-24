package week12d02;

public enum Fence {
    PERFECT(0), NEED_UPGRADE(0), NO_FENCE(0);

    private int n;

    Fence(int n) {
        this.n = n;
    }

    public int getN(Fence fence) {
        return fence.n;
    }

    public void setN() {
        n++;
    }
}
