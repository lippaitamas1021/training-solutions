package practice;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Integer> phoneNumbersByNames = new HashMap<>();

    public PhoneBook() {
    }

    public void addEntry(String name, Integer phoneNumber) {
        this.phoneNumbersByNames.put(name, phoneNumber);
    }

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addEntry("John Doe", 5551234);
    }
}
