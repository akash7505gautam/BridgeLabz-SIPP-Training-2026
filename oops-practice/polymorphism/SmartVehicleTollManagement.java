class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public double calculateToll() {
        return 0;
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {
    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 200;
    }
}

class Truck extends Vehicle {
    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 300;
    }
}

public class SmartVehicleTollManagement {

    public static double calculateTotalRevenue(Vehicle[] vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateToll();
        }
        return total;
    }

    public static void searchVehicle(Vehicle[] vehicles, String vehicleNumber) {
        for (Vehicle v : vehicles) {
            if (v.vehicleNumber.equals(vehicleNumber)) {
                System.out.println("Vehicle Found:");
                v.display();
                System.out.println("Toll: Rs. " + v.calculateToll());
                return;
            }
        }
        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("UP85AB1234", "Nishant"),
                new Bus("UP32CD5678", "Rahul"),
                new Truck("DL01EF9876", "Amit"),
                new Car("HR26GH1111", "Priya"),
                new Truck("RJ14JK2222", "Rohan")
        };

        double highest = 0;
        Vehicle highestVehicle = null;

        int cars = 0, buses = 0, trucks = 0;

        for (Vehicle v : vehicles) {
            double toll = v.calculateToll();

            v.display();
            System.out.println("Toll: Rs. " + toll);
            System.out.println();

            if (toll > highest) {
                highest = toll;
                highestVehicle = v;
            }

            if (v instanceof Car)
                cars++;
            else if (v instanceof Bus)
                buses++;
            else if (v instanceof Truck)
                trucks++;
        }

        System.out.println("Total Revenue: Rs. " + calculateTotalRevenue(vehicles));

        System.out.println("\nHighest Toll Paid:");
        highestVehicle.display();
        System.out.println("Toll: Rs. " + highest);

        System.out.println("\nVehicle Count");
        System.out.println("Cars: " + cars);
        System.out.println("Buses: " + buses);
        System.out.println("Trucks: " + trucks);

        System.out.println();
        searchVehicle(vehicles, "DL01EF9876");
    }
}