package hu.nive.ujratervezes.kepesitovizsga.architect;

public class PublicBuildingPlan implements Plan {

    private String workingTitle;
    private PlanType planType;
    private int stock;
    private int area;

    public PublicBuildingPlan(String workingTitle, int stock, int area) {
        this.workingTitle = workingTitle;
        this.stock = stock;
        this.area = area;
    }

    public String getWorkingTitle() {
        return workingTitle;
    }

    public PlanType getPlanType() {
        return planType;
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
        return PlanType.PUBLIC;
    }
}
