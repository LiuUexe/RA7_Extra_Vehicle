package classes;

public abstract class Vehicle {

    String licensePlate;
    String color;
    String manufacturer;

    public Vehicle(String licensePlate, String color, String manufacturer) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract double calculatePrice(int days);

    @Override
    public String toString() {
        return "License Plate: " + licensePlate + ", color: " + color + ", manufacturer: " + manufacturer + '}';
    }

}
