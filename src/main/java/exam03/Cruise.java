package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("The boat is full");
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getMultiplier() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("Can not find the passenger");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> ordered = new ArrayList<>();
        Collections.sort(passengers, new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        );
        return ordered;
    }

    public double sumAllBookingsCharged() {
        double counter = 0;
        for (Passenger passenger : passengers) {
            counter += passenger.getCruiseClass().getMultiplier() * basicPrice;
        }
        return counter;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        return null;
    }
}
