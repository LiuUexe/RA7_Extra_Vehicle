package classes;

public class Truck extends Vehicle {

    private int pma;

    public Truck( String licensePlate, String color, String manufacturer, int pma) {
        super(licensePlate, color, manufacturer);
        this.pma = pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
    
    
    

    @Override
    public double calculatePrice(int days) {
        return (50 * days) + (20 * pma);
    }

    @Override
    public String toString() {
        System.out.println("\n---Car---");
        System.out.println("-Lincense Plate " + licensePlate);
        System.out.println("-Color " + color);
        System.out.println("-Manufacturer " + manufacturer);
        System.out.println("-Maximum authorized weight " + pma);
        return "";
    }

}
