package classes;

public class Car extends Vehicle {

    private int seats;

    public Car(String licensePlate, String color, String manufacturer, int seats) {
        super(licensePlate, color, manufacturer);
        this.seats = seats;
    }
    
    


    @Override
    public double calculatePrice(int days) {
        return (50 * days) + (1.5 * seats * days);
    }

    @Override
    public String toString() {
        System.out.println("\n---Car---");
        System.out.println("-Lincense Plate " + licensePlate);
        System.out.println("-Color " + color);
        System.out.println("-Manufacturer " + manufacturer);
        System.out.println("-Seats " + seats);
        return "";

    }

}
