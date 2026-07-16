class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP80A101", "Amit", "Car");
        vehicles[1] = new Vehicle("UP80B102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP80C103", "Priya", "Car");
        vehicles[3] = new Vehicle("UP80D104", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP80E105", "Rohan", "Car");
        vehicles[5] = new Vehicle("UP80F106", "Karan", "Bike");
        vehicles[6] = new Vehicle("UP80G107", "Simran", "Car");
        vehicles[7] = new Vehicle("UP80H108", "Ankit", "Bike");
        vehicles[8] = new Vehicle("UP80I109", "Pooja", "Car");
        vehicles[9] = new Vehicle("UP80J110", "Vikas", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}