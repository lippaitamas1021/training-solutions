package week07d05;

public class Main {

    public static void main(String[] args) {
        AbstractVehicle abstractVehicle = new AbstractVehicle(5, TransmissionType.MANUAL);
        Vehicle car = new Car(6);
        Motorcycle motorcycle = new Motorcycle(4);

        System.out.println(abstractVehicle.getTransmissionType());
        System.out.println(car.getTransmissionType());
        System.out.println(motorcycle.getTransmissionType());
        System.out.println(motorcycle.getNumberOfGears());
    }
}
