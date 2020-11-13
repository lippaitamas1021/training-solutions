package introconstructors;

class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Trophy", 5);
        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());
    }
}