class Subscription {
    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    public double calculateMonthlyCharge() {
        return 0;
    }

    public void display() {
        System.out.println("Subscriber Name: " + subscriberName);
        System.out.println("Subscription ID: " + subscriptionId);
    }
}

class BasicPlan extends Subscription {
    BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {
    PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {
    FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 799;
    }
}

public class StreamingPlatform {

    public static void searchById(Subscription[] subscriptions, String id) {
        for (Subscription s : subscriptions) {
            if (s.subscriptionId.equals(id)) {
                System.out.println("Subscription Found:");
                s.display();
                System.out.println("Monthly Charge: Rs. " + s.calculateMonthlyCharge());
                return;
            }
        }
        System.out.println("Subscription Not Found");
    }

    public static void displayByLetter(Subscription[] subscriptions, char letter) {
        System.out.println("Subscribers starting with '" + letter + "':");
        for (Subscription s : subscriptions) {
            if (Character.toUpperCase(s.subscriberName.charAt(0)) == Character.toUpperCase(letter)) {
                s.display();
                System.out.println();
            }
        }
    }

    public static double calculateTotalRevenue(Subscription[] subscriptions) {
        double total = 0;
        for (Subscription s : subscriptions) {
            total += s.calculateMonthlyCharge();
        }
        return total;
    }

    public static void main(String[] args) {

        Subscription[] subscriptions = {
            new BasicPlan("Nishant", "S101"),
            new PremiumPlan("Rahul", "S102"),
            new FamilyPlan("Priya", "S103"),
            new PremiumPlan("Rohan", "S104"),
            new BasicPlan("Neha", "S105")
        };

        double highest = 0;
        Subscription expensive = null;

        for (Subscription s : subscriptions) {
            s.display();
            System.out.println("Monthly Charge: Rs. " + s.calculateMonthlyCharge());
            System.out.println();

            if (s.calculateMonthlyCharge() > highest) {
                highest = s.calculateMonthlyCharge();
                expensive = s;
            }
        }

        System.out.println("Total Monthly Revenue: Rs. " + calculateTotalRevenue(subscriptions));

        System.out.println("\nMost Expensive Subscription:");
        expensive.display();
        System.out.println("Monthly Charge: Rs. " + highest);

        System.out.println();
        searchById(subscriptions, "S103");

        System.out.println();
        displayByLetter(subscriptions, 'N');
    }
}