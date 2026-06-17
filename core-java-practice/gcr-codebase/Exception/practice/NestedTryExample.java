public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            
            try {
                // Inner try block 1
                int result = numbers[1] / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught in inner try block 1: " + e.getMessage());
            }

            try {
                // Inner try block 2
                System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught in inner try block 2: " + e.getMessage());
            }

            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
            
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in outer try block: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught in outer try block: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}
