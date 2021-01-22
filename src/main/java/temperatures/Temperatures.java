package temperatures;

import java.nio.file.Files;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte temp : data) {
            sum += temp;
        }
        return sum / 365;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (int i = data.length - 1; data.length - 31 < i; i--) {
            sum += data[i];
        }
        return sum / 30;
    }
}
