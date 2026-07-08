import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Phone: " + phone +
               ", Email: " + email;
    }
}

class AddressBook {
    private ArrayList<Contact> contacts;
    private HashMap<String, Contact> contactMap;
    private HashSet<String> phoneNumbers;

    public AddressBook() {
        contacts = new ArrayList<>();
        contactMap = new HashMap<>();
        phoneNumbers = new HashSet<>();
    }

    // Add Contact
    public void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number not allowed!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        contactMap.put(name, c);
        phoneNumbers.add(phone);

        System.out.println("Contact added successfully.");
    }

    // Search Contact
    public void searchContact(String name) {
        Contact c = contactMap.get(name);

        if (c != null) {
            System.out.println("Contact Found:");
            System.out.println(c);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {
        Contact c = contactMap.get(name);

        if (c != null) {
            contacts.remove(c);
            phoneNumbers.remove(c.phone);
            contactMap.remove(name);

            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Display Sorted Contacts
    public void displayContacts() {
        Collections.sort(contacts);

        System.out.println("\nContacts Sorted By Name:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

public class AddressContacts{
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        book.addContact("Aman", "9876543210", "aman@gmail.com");
        book.addContact("Riya", "9123456780", "riya@gmail.com");
        book.addContact("Karan", "9988776655", "karan@gmail.com");

        // Duplicate phone number
        book.addContact("Rahul", "9876543210", "rahul@gmail.com");

        System.out.println();

        book.searchContact("Riya");

        System.out.println();

        book.deleteContact("Karan");

        book.displayContacts();
    }
}