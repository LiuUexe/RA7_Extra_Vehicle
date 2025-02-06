package classes;

public class Motorcycle extends Vehicle {

    private int cc;

    public Motorcycle( String licensePlate, String color, String manufacturer, int cc) {
        super(licensePlate, color, manufacturer);
        this.cc = cc;
    }

    @Override
    public double calculatePrice(int days) {
        return (50 * days) + (0.05 * cc * days);
    }

    @Override
    public String toString() {
        System.out.println("\n---Car---");
        System.out.println("-Lincense Plate " + licensePlate);
        System.out.println("-Color " + color);
        System.out.println("-Manufacturer " + manufacturer);
        System.out.println("-Cylinders Capacity " + cc);
        return "";

    }

}
