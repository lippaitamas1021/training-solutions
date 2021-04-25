package hu.nive.ujratervezes.kepesitovizsga.architect;

public enum PlanType {
    RESIDENTIAL(""),
    PUBLIC(""),
    INDUSTRIAL("");

    private String projectName;

    PlanType(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
