package standarddev;

public class Deviation {

    public double standardDeviation(double[] numbers) {
        double sum = 0;
        for (double d : numbers) {
            sum += d;
        }
        double average = sum / numbers.length;
        double partSum = 0;
        for (double d : numbers) {
            partSum += (average - d) * (average - d);
        }
        double s = partSum / (numbers.length - 1);
        double result = Math.sqrt(s);
        return result;
    }
}
