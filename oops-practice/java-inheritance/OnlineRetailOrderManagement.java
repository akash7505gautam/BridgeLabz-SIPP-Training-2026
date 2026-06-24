class Order {
    protected int orderId;
    protected String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "24-06-2026",
                "TRK12345",
                "27-06-2026"
        );

        order.displayDetails();

        // Multilevel Inheritance Demonstration
        ShippedOrder shipped = order;
        Order base = order;

        System.out.println("\nStatus via ShippedOrder Reference: "
                + shipped.getOrderStatus());

        System.out.println("Status via Order Reference: "
                + base.getOrderStatus());
    }
}