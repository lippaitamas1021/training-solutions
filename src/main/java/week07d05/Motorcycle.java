package week07d05;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(int numberOfGears) {
        super(numberOfGears, TransmissionType.SEQUENTIAL);
    }
}
