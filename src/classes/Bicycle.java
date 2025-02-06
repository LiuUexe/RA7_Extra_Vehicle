package classes;

public class Bicycle extends Vehicle {

    boolean electric;

    public Bicycle(String licensePlate, String color, String manufacturer, boolean electric) {
        super(licensePlate, color, manufacturer);
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public double calculatePrice(int days) {
        return (50 * days) + (electric ? 15 : 10);
    }

    @Override
    public String toString() {
        System.out.println("\n---Car---");
        System.out.println("-Lincense Plate " + licensePlate);
        System.out.println("-Color " + color);
        System.out.println("-Manufacturer " + manufacturer);
        System.out.println("-Electric? " + electric);
        return "";
    }

}
