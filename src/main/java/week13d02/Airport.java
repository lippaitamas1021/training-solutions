package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void readFromFile(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid filename");
        }
        Path file = Path.of(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(file))) {
            String line;
            String[] splittedLines;
            int hour;
            int minute;
            while ((line = bufferedReader.readLine()) != null) {
                splittedLines = line.split(" ");
                hour = Integer.parseInt(splittedLines[3].substring(0, splittedLines[3].indexOf(":")));
                minute = Integer.parseInt(splittedLines[3].substring(splittedLines[3].indexOf(":") - 1));
                flights.add(new Flight(splittedLines[0], splittedLines[1], splittedLines[2], hour, minute));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Flight not found", ioe);
        }
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }

    public String typeFinder() {
        int arrival = 0;
        int departure = 0;
        for (Flight flight : flights) {
            if (flight.getType().equals("Departure")) {
                departure++;
            } else {
                arrival++;
            }
        }
        return arrival > departure ? "Arrival" : "Departure";
    }

    public Flight flightFinder(String keyword) {
        for (Flight flight : flights) {
            if (flight.getName().equals(keyword)) {
                return flight;
            }
        }
        throw new IllegalArgumentException("Flight can not be found");
    }

    public List<Flight> flightFinderByCityAndType(String city, String type) {
        List<Flight> flights2 = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getTarget().equals(city) && flight.getType().equals(type)) {
                flights2.add(flight);
            }
        }
        if (0 < flights.size()) {
            return flights;
        }
        throw new IllegalArgumentException("No flight found");
    }

    public Flight earlierFlight() {
        int minHour = Integer.MAX_VALUE;
        Flight result = flights.get(0);
        int temp;
        for (Flight flight : flights) {
            temp = flight.getHour() * 60 + flight.getMinute();
            if (temp < minHour) {
                minHour = temp;
                result = flight;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.readFromFile("cities.txt");
        System.out.println(airport.getFlights().size());
        System.out.println(airport.typeFinder());
        System.out.println(airport.flightFinder("KJ7245"));
        System.out.println(airport.flightFinderByCityAndType("Budapest", "Arrival"));
        System.out.println(airport.earlierFlight());
    }
}
