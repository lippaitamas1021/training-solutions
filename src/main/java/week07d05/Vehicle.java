package week07d05;

public class Vehicle {

    private int NumberOfGears;
    private TransmissionType transmissionType;

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        NumberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public int getNumberOfGears() {
        return NumberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5,TransmissionType.MANUAL);
        System.out.println("Vehicle: Number of Gears: " + vehicle.getNumberOfGears() + ", Type of transmission: " + vehicle.getTransmissionType());

        Car car = new Car(6, TransmissionType.SEQUENTIAL);
        System.out.println("Car: Number of gears: " + car.getNumberOfGears() + ", Type of transmission: " + car.getTransmissionType());

        Truck truck = new Truck(8, TransmissionType.AUTOMATIC);
        System.out.println("Truck: Number of gears: " + truck.getNumberOfGears() + ", Type of transmission: " + truck.getTransmissionType());

        Motorcycle motorcycle = new Motorcycle(4, TransmissionType.MANUAL);
        System.out.println("Motorcycle: Number of gears: " + motorcycle.getNumberOfGears() + ", Type of transmission: " + motorcycle.getTransmissionType());

    }
}
