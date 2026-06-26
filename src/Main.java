import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingManager parking = new ParkingManager();

        int choice;

        do {

            System.out.println("\n=========================================");
            System.out.println("     VEHICLE PARKING MANAGEMENT SYSTEM");
            System.out.println("=========================================");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Display Slot Status");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNumber = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String ownerName = sc.nextLine();

                    System.out.print("Enter Vehicle Type (Bike/Car/Truck): ");
                    String vehicleType = sc.nextLine();

                    // Block and Slot are automatically assigned
                    Vehicle vehicle = new Vehicle(
                            vehicleNumber,
                            ownerName,
                            vehicleType,
                            "",
                            0
                    );

                    parking.parkVehicle(vehicle);
                    break;

                case 2:

                    System.out.print("Enter Vehicle Number to Remove: ");
                    String removeNumber = sc.nextLine();

                    parking.removeVehicle(removeNumber);
                    break;

                case 3:

                    System.out.print("Enter Vehicle Number to Search: ");
                    String searchNumber = sc.nextLine();

                    parking.searchVehicle(searchNumber);
                    break;

                case 4:

                    parking.displayVehicle();
                    break;

                case 5:

                    parking.displaySlotStatus();
                    break;

                case 6:

                    System.out.println("\nThank You for Using Vehicle Parking Management System.");
                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 6);

        sc.close();
    }
}