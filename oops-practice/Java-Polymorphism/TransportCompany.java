class Vehicle {
    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 8.0;
    }

    public void carInfo() {
        System.out.println("This is a Car.");
    }
}

class Bus extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 15.0;
    }

    public void busInfo() {
        System.out.println("This is a Bus.");
    }
}

class Bike extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 3.0;
    }

    public void bikeInfo() {
        System.out.println("This is a Bike.");
    }
}

class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 2.0;
    }

    public void electricCarInfo() {
        System.out.println("This is an Electric Car.");
    }
}

public class TransportCompany {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : fleet) {
            System.out.println("Fuel Cost for " + km + " km = Rs. " + v.fuelCost(km));

            if (v instanceof Car) {
                ((Car) v).carInfo();
            } else if (v instanceof Bus) {
                ((Bus) v).busInfo();
            } else if (v instanceof Bike) {
                ((Bike) v).bikeInfo();
            } else if (v instanceof ElectricCar) {
                ((ElectricCar) v).electricCarInfo();
            }

            System.out.println("-----------------------");
        }
    }
}