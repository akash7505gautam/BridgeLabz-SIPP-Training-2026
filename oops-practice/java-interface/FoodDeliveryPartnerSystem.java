interface FoodDelivery {
    void deliverFood(String customer);

    default void trackOrder() {
        System.out.println("Tracking food order...");
    }

    static String generateDeliveryCode() {
        return "FD1001";
    }
}

interface GroceryDelivery {
    void deliverGroceries(String customer);

    default void trackOrder() {
        System.out.println("Tracking grocery order...");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    public void deliverFood(String customer) {
        System.out.println("Food delivered to " + customer);
    }

    public void deliverGroceries(String customer) {
        System.out.println("Groceries delivered to " + customer);
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

public class FoodDeliveryPartnerSystem {
    public static void main(String[] args) {

        String[] customers = {"Rahul", "Priya", "Aman", "Neha"};

        DeliveryExecutive executive = new DeliveryExecutive();

        for (String customer : customers) {
            System.out.println("\nCustomer: " + customer);
            System.out.println("Delivery Code: " + FoodDelivery.generateDeliveryCode());
            executive.trackOrder();
            executive.deliverFood(customer);
            executive.deliverGroceries(customer);
        }
    }
}