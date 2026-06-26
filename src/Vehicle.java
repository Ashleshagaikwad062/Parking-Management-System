import java.time.LocalDateTime;

public class Vehicle {

    private String VehicleNumber;
    private String OwnerName;
    private String VehicleType;
    private String Block;
    private int SlotNumber;
    private LocalDateTime EntryTime;

    public Vehicle(String VehicleNumber, String OwnerName, String VehicleType,
                   String Block, int SlotNumber) {

        this.VehicleNumber = VehicleNumber;
        this.OwnerName = OwnerName;
        this.VehicleType = VehicleType;
        this.Block = Block;
        this.SlotNumber = SlotNumber;
        this.EntryTime = LocalDateTime.now();
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getBlock() {
        return Block;
    }

    public int getSlotNumber() {
        return SlotNumber;
    }

    public LocalDateTime getEntryTime() {
        return EntryTime;
    }
}