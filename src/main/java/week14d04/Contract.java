package week14d04;

import java.util.ArrayList;
import java.util.List;

public class Contract {

    private String client;
    private List<Integer> monthlyPrices;

    public Contract(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }
    
    public Contract(Contract contract, String client) {                 //ez a copy constructor
        this.client = client;
        monthlyPrices = new ArrayList<>(contract.monthlyPrices);
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setMonthlyPrices(List<Integer> monthlyPrices) {
        this.monthlyPrices = monthlyPrices;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "client='" + client + '\'' +
                ", monthlyPrices=" + monthlyPrices +
                '}';
    }
}
