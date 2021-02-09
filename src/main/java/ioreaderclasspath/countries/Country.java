package ioreaderclasspath.countries;

public class Country {

    private String name;
    private int borderCountries;

    public Country(String name, int borderCountrues) {
        this.name = name;
        this.borderCountries = borderCountrues;
    }

    public String getName() {
        return name;
    }

    public int getBorderCountries() {
        return borderCountries;
    }
}
