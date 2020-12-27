package introinheritance.employee;

public class BigBoss extends Boss {

    private double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployess, double bonus) {
        super(name, address, salary, numberOfEmployess);
        this.bonus = bonus;
    }

    @Override
    public int getNumberOfEmployess() {
        return super.getNumberOfEmployess();
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
