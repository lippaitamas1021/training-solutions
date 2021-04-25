package hu.nive.ujratervezes.kepesitovizsga.architect;

public class IndustrialBuildingPlan implements Plan {

    private String workingTite;
    private PlanType planType;
    private int areaOfOfficeBlock;
    private int stock;
    private int areaOfManufacturingHall;

    public IndustrialBuildingPlan(String workingTitle, int areaOfOfficeBlock, int stock, int areaOfManufacturingHall) {
        this.workingTite = workingTitle;
        this.areaOfOfficeBlock = areaOfOfficeBlock;
        this.stock = stock;
        this.areaOfManufacturingHall = areaOfManufacturingHall;
    }

    public String getWorkingTite() {
        return workingTite;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public int getAreaOfOfficeBlock() {
        return areaOfOfficeBlock;
    }

    public int getStock() {
        return stock;
    }

    public int getAreaOfManufacturingHall() {
        return areaOfManufacturingHall;
    }

    @Override
    public String getProjectName() {
        return workingTite;
    }

    @Override
    public int calculateSquareMeter() {
        return areaOfOfficeBlock * stock + areaOfManufacturingHall;
    }

    @Override
    public PlanType getType() {
        return PlanType.INDUSTRIAL;
    }
}
