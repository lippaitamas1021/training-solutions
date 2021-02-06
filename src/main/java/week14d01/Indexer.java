package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> result = new HashMap();
        for (String name : names) {
            char initial = name.charAt(0);
            if (!result.containsKey(initial)) {
                result.put(initial, new ArrayList<>());
            }
            result.get(initial).add(name);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Olga", "Lili", "Albert", "Mózes")));     //multiMap, ha egy kulcshoz több érték tartozik
    }
}


// Map<Character, List<String>> expected = new HashMap<>();
// Map<Character, List<String>> expected = Map.of("A", Arrays.asList("Abraham"), "L", Arrays.asList("Lujza"));
// VAGY expected.put("A", Arrays.asList("Abraham"), "L", Arrays.asList("Lujza"));

