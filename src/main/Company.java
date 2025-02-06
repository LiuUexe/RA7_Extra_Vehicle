package main;

import java.util.Scanner;
import java.util.ArrayList;
import classes.*;

public class Company {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Company company = new Company();

        boolean exit = false;
        int option;
        do {
            System.out.println("\n===========================");
            System.out.println("        Main Menu       ");
            System.out.println("===========================");
            System.out.println("1) New Vehicle");
            System.out.println("2) Show Fleet");
            System.out.println("3) Rent a Vehicle");
            System.out.print("Select an option: ");
            option = company.sc.nextInt();
            company.sc.nextLine();

            switch (option) {
                case 1:
                    company.newVehicle();
                    break;
                case 2:
                    company.showFleet();
                    break;
                case 3:
                    company.rentVehicle();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (!exit);

    }

    public void newVehicle() {
        System.out.println("License Plate: ");
        String licensePlate = sc.nextLine();

        for (Vehicle v : vehicles) {
            if (v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                System.out.println("This vehicle is already exist");
                return;
            }
        }

        System.out.println("Color: ");
        String color = sc.nextLine();
        System.out.println("Manufacturer: ");
        String manufacturer = sc.nextLine();

        System.out.println("Select Vehicle type: ");
        System.out.println("1) Car");
        System.out.println("2) Motorcyle");
        System.out.println("3) Truck");
        System.out.println("4) Bicyle");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println("Seats: ");
                int seats = sc.nextInt();
                sc.nextLine();
                vehicles.add(new Car(licensePlate, color, manufacturer, seats));
                break;

            case 2:
                System.out.println("cc: ");
                int cc = sc.nextInt();
                sc.nextLine();
                vehicles.add(new Motorcycle(licensePlate, color, manufacturer, cc));
                break;
            case 3:
                System.out.println("PMA (Tons): ");
                int pma = sc.nextInt();
                sc.nextLine();
                vehicles.add(new Truck(licensePlate, color, manufacturer, pma));
                break;
            case 4:
                System.out.println("Electric (True/False) ");
                boolean electric = sc.nextBoolean();
                sc.nextLine();
                vehicles.add(new Bicycle(licensePlate, color, manufacturer, electric));
                break;
            default:
                System.out.println("Option Invalid. Please Try Again");
        }

        System.out.println("Vehicle added Succesfully");

    }

    public void showFleet() {
        if (vehicles.isEmpty()) {
            System.out.println("No Vehicle registered");
            return;
        }

        System.out.println("\nRegistered Vehicles");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

    }

    public void rentVehicle() {
        

    }

}
