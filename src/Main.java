public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        System.out.println("Hello world!");
        System.out.println(customers.name);
        Booking booking = new Booking("adam", 50);
        System.out.println(booking.getName() + " is " + booking.getAge() + "yrs old");
    }
}