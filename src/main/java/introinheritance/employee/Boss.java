package introinheritance.employee;

public class Boss extends Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployess;

    public Boss(String name, String address, double salary, int numberOfEmployess) {
        super(name, address, salary);
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (numberOfEmployess * LEADERSHIP_FACTOR * super.getSalary());
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }
}
