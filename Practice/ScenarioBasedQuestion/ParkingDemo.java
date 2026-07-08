import java.util.ArrayList;

class SmartParkingManager {

    private ArrayList<String> vehicles = new ArrayList<>();

    // Add Vehicle (Enter Parking)
    public void vehicleEntry(String regNo) {
        vehicles.add(regNo);
        System.out.println(regNo + " entered the parking area.");
    }

    // Remove Vehicle (Exit Parking)
    public void vehicleExit(String regNo) {
        if (vehicles.remove(regNo)) {
            System.out.println(regNo + " exited the parking area.");
        } else {
            System.out.println(regNo + " not found in parking.");
        }
    }

    // Search Vehicle
    public void searchVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println(regNo + " is currently parked.");
        } else {
            System.out.println(regNo + " is not parked.");
        }
    }

    // Display All Vehicles
    public void displayVehicles() {
        System.out.println("\nVehicles Currently Parked:");

        if (vehicles.isEmpty()) {
            System.out.println("Parking area is empty.");
        } else {
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }

        System.out.println("Total Occupied Slots: " + vehicles.size());
    }
}

public class ParkingDemo {
    public static void main(String[] args) {

        SmartParkingManager parking = new SmartParkingManager();

        // Vehicle Entry
        parking.vehicleEntry("UP81AB1234");
        parking.vehicleEntry("DL01XY5678");
        parking.vehicleEntry("HR26CD9012");

        // Display Vehicles
        parking.displayVehicles();

        // Search Vehicle
        System.out.println();
        parking.searchVehicle("DL01XY5678");

        // Vehicle Exit
        System.out.println();
        parking.vehicleExit("DL01XY5678");

        // Display After Exit
        parking.displayVehicles();
    }
}