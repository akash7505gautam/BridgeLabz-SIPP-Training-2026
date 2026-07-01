import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            Product removed = items.remove(index);
            System.out.println(removed.getName() + " removed from cart.");
        } else {
            System.out.println("Invalid item selection.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }

        System.out.println("\n--- Current Shopping Cart ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i));
        }
        System.out.println("Total Amount: $" + calculateTotal() + "\n");
    }
}

public class Shopping {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem(new Product("Wireless Mouse", 25.99));
        myCart.addItem(new Product("Mechanical Keyboard", 89.99));
        myCart.addItem(new Product("HDMI Cable", 12.50));

        myCart.showCart();

        myCart.removeItem(2);

        myCart.showCart();
    }
}