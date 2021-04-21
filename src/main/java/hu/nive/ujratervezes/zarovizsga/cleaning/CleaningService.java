package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables = new ArrayList<>();

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
    }

    public int cleanAll() {
        int sum = 0;
        for (Cleanable cleanable : cleanables) {
            sum += cleanable.clean();
        }
        cleanables.clear();
        return sum;
    }

    public int cleanOnlyOffices() {
        int sum = 0;
        for (Cleanable cleanable : cleanables) {
            if (cleanable.isOffice()) {
                sum += cleanable.clean();
            }
        }
        cleanables.removeIf(Cleanable::isOffice);
        return sum;
    }

    public List<Cleanable> findByAddressPart(String addressPart) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(addressPart)) {
                result.add(cleanable);
            }
        }
        return result;
    }

    public String getAddresses() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Cleanable cleanable : cleanables) {
            stringBuilder.append(cleanable.getAddress()).append(", ");
        }
        if (stringBuilder.isEmpty()) {
            return "";
        } else {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);
            return stringBuilder.toString().trim();
        }
    }

    public static void main(String[] args) {
        CleaningService cleaningService = new CleaningService();
        cleaningService.add(new House("Bp. Fo ut 1.", 130));
        cleaningService.add(new House("Bp. Fo ut 2.", 300));
        cleaningService.add(new Office("Bp. Fo ut 3.", 300, 3));
        cleaningService.add(new Office("Bp. Fo ut 4.", 300, 4));
        //System.out.println(cleaningService.cleanOnlyOffices());
        cleaningService.cleanAll();
        System.out.println(cleaningService.getAddresses());
    }
}
