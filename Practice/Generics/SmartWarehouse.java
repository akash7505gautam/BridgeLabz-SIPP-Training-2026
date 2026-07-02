import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    protected String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Electronics : " + name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Groceries : " + name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Furniture : " + name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouse {

    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.display();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        displayItems(electronicStorage.getItems());
        displayItems(groceryStorage.getItems());
        displayItems(furnitureStorage.getItems());
    }
}
