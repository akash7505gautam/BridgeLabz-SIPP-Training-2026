import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Category: " + category.getCategoryName());
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class OnlineMarketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * percentage / 100;
        product.setPrice(product.getPrice() - discount);
    }

    public static void main(String[] args) {

        List<Product<? extends Category>> catalog = new ArrayList<>();

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> cloth =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> gadget =
                new Product<>("Smartphone", 25000, new GadgetCategory());

        catalog.add(book);
        catalog.add(cloth);
        catalog.add(gadget);

        applyDiscount(book, 10);
        applyDiscount(cloth, 20);
        applyDiscount(gadget, 5);

        for (Product<? extends Category> product : catalog) {
            product.display();
        }
    }
}