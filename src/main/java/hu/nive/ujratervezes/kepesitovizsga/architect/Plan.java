package hu.nive.ujratervezes.kepesitovizsga.architect;

public interface Plan {

    String getProjectName();

    PlanType getType();

    int calculateSquareMeter();
}
