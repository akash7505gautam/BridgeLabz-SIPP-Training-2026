public class LibrarySystem {

    static String[] books = {"Java", null, "Python", "DBMS"};

    public static int getBookLength(int index) {
        try {
            return books[index].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid book index.");
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Error: Book entry is null.");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Length: " + getBookLength(0));
        System.out.println("Length: " + getBookLength(1));
        System.out.println("Length: " + getBookLength(5));
    }
}