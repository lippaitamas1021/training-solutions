package hu.nive.ujratervezes.kepesitovizsga.architect;

public class ResidentialBuildingPlan implements Plan {

    private String workingTitle;
    private PlanType planType;
    private House house;
    private int stock;
    private int area;

    public ResidentialBuildingPlan(String workingTitle, House house, int stock, int area) {
        this.workingTitle = workingTitle;
        this.house = house;
        this.stock = stock;
        this.area = area;
    }

    public String getWorkingTitle() {
        return workingTitle;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public House getHouse() {
        return house;
    }

    public int getStock() {
        return stock;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String getProjectName() {
        return workingTitle;
    }

    @Override
    public int calculateSquareMeter() {
        return stock * area;
    }

    @Override
    public PlanType getType() {
        return PlanType.RESIDENTIAL;
    }
}
