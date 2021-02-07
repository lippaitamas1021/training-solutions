package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthylyPrices) {
        this.template = new Contract(client, monthylyPrices);
    }

    public Contract getTemplate() {
        return template;
    }

    public Contract create(String client) {
      return new Contract(template, client);
    }

    public static void main(String[] args) {
        ContractCreator contractCreator = new ContractCreator("Trey Parker", new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120)));
        Contract mila = contractCreator.create("Mila Kunis");
        Contract ed = contractCreator.create("Ed Harris");
        System.out.println(mila);
        System.out.println(ed);
        mila.getMonthlyPrices().set(1, 30);
        System.out.println(mila);
        System.out.println(contractCreator.getTemplate().getMonthlyPrices());   //az eredeti template is módosulhat, ha ezt el akarjuk kerülni, akkor a creat metódusban new ArrayList<>()-et kell haszbálni
        Contract elon = contractCreator.create("Elon Musk");
        System.out.println(elon);
    }
}
