package classsctructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store appleStore = new Store("apple");
        appleStore.store(10);
        System.out.println(appleStore.getProduct() + ": " + appleStore.getStock());

        Store pearStore = new Store("pear");
        pearStore.store(20);
        System.out.println(pearStore.getProduct() + ": " + pearStore.getStock());

        appleStore.store(7);
        appleStore.dispatch(8);
        pearStore.store(3);
        pearStore.dispatch(6);

        System.out.println(appleStore.getProduct() + ": " + appleStore.getStock());
        System.out.println(pearStore.getProduct() + ": " + pearStore.getStock());
    }
}
