package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public void add(Pet pet) {
        if (!pets.contains(pet)) {
            pets.add(pet);
        }
    }

    public List<Pet> getPets() {
        return pets;
    }
}
