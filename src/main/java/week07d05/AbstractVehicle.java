package week07d05;

public class AbstractVehicle implements Vehicle {

    private int numberOfGears;
    private TransmissionType transmissionType;
    private int currentGear = 0;

    public AbstractVehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    @Override
    public final void switchGear(int gear) {
        this.currentGear = gear;
    }

    @Override
    public final int getNumberOfGears() {
        return numberOfGears;
    }

    @Override
    public final TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
