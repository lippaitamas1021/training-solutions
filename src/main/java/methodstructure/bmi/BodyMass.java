package methodstructure.bmi;

public class BodyMass {

    private double weight;
    private double height;

    public static double LOWER_LIMIT = 18.5;
    public static double UPPER_LIMIT = 25.0;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {
       return weight / (height * height);
    }

    public BmiCategory body() {
        double bmi = bodyMassIndex();
        if (bmi < LOWER_LIMIT) {
            return BmiCategory.UNDERWEIGHT;
        } else if (UPPER_LIMIT < bmi) {
            return BmiCategory.OVERWEIGHT;
        } else {
            return BmiCategory.NORMAL;
        }
    }

    public boolean isThinnerThan(BodyMass bodyMass) {
        return bodyMassIndex() < this.bodyMassIndex();
        }

    }
