package finalmodifier;

public class TaxCalculator {

    public static final double hunVAT = 27;


    public double tax(double price) {
        return price * hunVAT / 100;
    }

    double priceWithTax(double price) {
        return price * (1 + hunVAT / 100);
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(1000));
        System.out.println(new TaxCalculator().priceWithTax(1000));
    }
}
