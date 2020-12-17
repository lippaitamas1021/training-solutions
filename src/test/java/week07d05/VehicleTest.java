package week07d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void vehicleTest() {
        AbstractVehicle abstractVehicle = new AbstractVehicle(5, TransmissionType.MANUAL);
        assertEquals(5, abstractVehicle.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, abstractVehicle.getTransmissionType());
    }

    @Test
    public void carTest() {
        Car car = new Car(6);
        assertEquals(6, car.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());
    }

    @Test
    public void truckTest() {
        Truck truck = new Truck(8, TransmissionType.AUTOMATIC);
        assertEquals(8, truck.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, truck.getTransmissionType());
    }

    @Test
    public void motorcycleTest() {
        Motorcycle motorcycle = new Motorcycle(4);
        assertEquals(4, motorcycle.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, motorcycle.getTransmissionType());
    }

}
