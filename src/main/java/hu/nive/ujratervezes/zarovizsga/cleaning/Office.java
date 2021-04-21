package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private String address;
    private int size;
    private int floors;

    public Office(String address, int size, int floors) {
        this.address = address;
        this.size = size;
        this.floors = floors;
    }

    public int getSize() {
        return size;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public int clean() {
        return floors * size * 100;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public boolean isOffice() {
        return true;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address='" + address + '\'' +
                ", size=" + size +
                ", floors=" + floors +
                '}';
    }
}
