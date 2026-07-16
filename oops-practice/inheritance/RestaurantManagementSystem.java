// Interface
interface Worker {
    void performDuties();
}
// Superclass
class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}
// Subclass 1
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing and cooking food.");
    }
}
// Subclass 2
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is taking orders and serving customers.");
    }
}
// Main Class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Aman", 102);
        System.out.println("Chef Details:");
        chef.displayInfo();
        chef.performDuties();
        System.out.println("\nWaiter Details:");
        waiter.displayInfo();
        waiter.performDuties();
    }
}