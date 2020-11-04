package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Lippai Tamás");
        client.setYear(1984);
        client.setAddress("NY");

        System.out.println("Ügyfél adatok: Név: " + client.getName() + ", Születési év: " + client.getYear() + ", Cím: " + client.getAddress() );

        client.migrate("London");

        System.out.println("Új lakcím: " + client.getAddress());
    }
}
