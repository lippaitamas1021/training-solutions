package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public int findSmallestOne() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        List<Integer> numbers2 = new ArrayList<>(numbers);      // ne az eredetit rendezzük, hanem egy másolatát
        Collections.sort(numbers2);                             // 11223345566
                                                                // a feltételvizsgálatokat érdemes kiszervezne egy másik metódusba, pl. checkSmallList()
        if (numbers2.get(0) != numbers2.get(1)) {
            return numbers2.get(0);
        }

        for (int i = 1; i < numbers2.size() - 1; i++) {         // csak akkor lép be a ciklusba, ha a lista min. 3 elemű
            if (numbers2.get(i-1) != numbers2.get(i) && numbers2.get(i+1) != numbers2.get(i)) {
                return numbers2.get(i);
            }
        }
        if (numbers2.get(numbers2.size() - 1) != numbers2.get(numbers2.size() - 2)) {
            return numbers2.get(numbers2.size() - 1);
        }
        throw new IllegalStateException("Wrong list");          // ha pl. nincs a listában egyedi elem (amiből egy van), akkor dob kivételt
    }


    public void addNumbers(String[] temp) {
        for (String t : temp) {
            numbers.add(Integer.parseInt(t));
        }
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public void readFromFile(String fileName) {
        Path path = Path.of(fileName);              // a Path egy interface, ezért nem lehet példányosítani, a Paths viszont egy osztály

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                addLine(temp);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Process went wrong", ioe);
        }
    }

    private void addLine(String[] temp) {
        for (String s : temp) {
            numbers.add(Integer.parseInt(s));
        }
    }

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        numberStat.readFromFile("numberstat.txt");
        System.out.println(numberStat.findSmallestOne());
    }
}
