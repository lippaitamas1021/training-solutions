package week03d04;

public class Phone {

    private String prefix;
    private String number;

    public Phone(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Az Ön telefonszáma{" +
                "körzetszám ='" + prefix + '\'' +
                ", telefonszám ='" + number + '\'' +
                '}';
    }
}

