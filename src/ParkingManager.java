import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingManager {

    Vehicle[] vehicles = new Vehicle[100];
    int count = 0;

    String[] blocks = {"A", "B", "C", "D"};
    boolean[][] slotOccupied = new boolean[4][25];


    public boolean isDuplicate(String vehicleNumber) {
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getVehicleNumber().equals(vehicleNumber)) {
                return true;
            }
        }
        return false;
    }


    public void parkVehicle(Vehicle v) {

        if (count >= 100) {
            System.out.println("~Parking Full~!");
            return;
        }

        if (isDuplicate(v.getVehicleNumber())) {
            System.out.println("~Vehicle Already Parked~!");
            return;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {

                if (!slotOccupied[i][j]) {

                    slotOccupied[i][j] = true;

                    Vehicle newVehicle = new Vehicle(
                            v.getVehicleNumber(),
                            v.getOwnerName(),
                            v.getVehicleType(),
                            blocks[i],
                            j + 1
                    );

                    vehicles[count] = newVehicle;
                    count++;

                    System.out.println("Vehicle Parked at: " + blocks[i] + "-" + (j + 1));
                    return;
                }
            }
        }
    }


    public void displaySlotStatus() {
        System.out.println("==== Slot Status ====");
        System.out.println("Total Slots: 100");
        System.out.println("Occupied Slots: " + count);
        System.out.println("Available Slots: " + (100 - count));
    }


    public void displayVehicle() {

        if (count == 0) {
            System.out.println("~No Vehicle Parked~");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Vehicle No: " + vehicles[i].getVehicleNumber());
            System.out.println("Owner     : " + vehicles[i].getOwnerName());
            System.out.println("Type      : " + vehicles[i].getVehicleType());
            System.out.println("Location  : " +
                    vehicles[i].getBlock() + "-" +
                    vehicles[i].getSlotNumber());
            System.out.println("Entry Time: " + vehicles[i].getEntryTime());
            System.out.println();
        }
    }


    public void searchVehicle(String vehicleNumber) {

        for (int i = 0; i < count; i++) {

            if (vehicles[i].getVehicleNumber().equals(vehicleNumber)) {

                System.out.println("Vehicle Found!");
                System.out.println("Number  : " + vehicles[i].getVehicleNumber());
                System.out.println("Owner   : " + vehicles[i].getOwnerName());
                System.out.println("Type    : " + vehicles[i].getVehicleType());
                System.out.println("Location: " +
                        vehicles[i].getBlock() + "-" +
                        vehicles[i].getSlotNumber());
                return;
            }
        }

        System.out.println("~Vehicle Not Found~");
    }


    public void removeVehicle(String vehicleNumber) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (vehicles[i].getVehicleNumber().equals(vehicleNumber)) {

                String block = vehicles[i].getBlock();
                int slot = vehicles[i].getSlotNumber() - 1;

                int blockIndex = 0;

                switch (block) {
                    case "A": blockIndex = 0; break;
                    case "B": blockIndex = 1; break;
                    case "C": blockIndex = 2; break;
                    case "D": blockIndex = 3; break;
                }

                slotOccupied[blockIndex][slot] = false;

                LocalDateTime exitTime = LocalDateTime.now();

                Duration duration = Duration.between(
                        vehicles[i].getEntryTime(),
                        exitTime
                );

                long hours = duration.toHours();
                if (hours == 0) hours = 1;

                long rate;

                switch (vehicles[i].getVehicleType().toLowerCase()) {
                    case "bike": rate = 10; break;
                    case "car": rate = 20; break;
                    case "truck": rate = 40; break;
                    default: rate = 25;
                }

                long fee = hours * rate;

                System.out.println("\n===== EXIT DETAILS =====");
                System.out.println("Vehicle No : " + vehicles[i].getVehicleNumber());
                System.out.println("Owner      : " + vehicles[i].getOwnerName());
                System.out.println("Type       : " + vehicles[i].getVehicleType());
                System.out.println("Location   : " +
                        vehicles[i].getBlock() + "-" +
                        vehicles[i].getSlotNumber());
                System.out.println("Entry Time : " + vehicles[i].getEntryTime());
                System.out.println("Exit Time  : " + exitTime);
                System.out.println("Fee        : " + fee);

                for (int j = i; j < count - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }

                vehicles[count - 1] = null;
                count--;

                found = true;
                System.out.println("~Vehicle Removed Successfully~");
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle Not Found");
        }
    }
}