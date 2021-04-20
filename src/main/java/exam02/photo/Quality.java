package exam02.photo;

public enum Quality {
    NO_STAR(0),
    ONE_STAR(1),
    TWO_STAR(2);

    private int numberOfStars;

    Quality(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }
}
