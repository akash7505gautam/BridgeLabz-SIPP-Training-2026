public class ThrowExample {
    public static void main(String[] args) {
        validateAge(15);
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid age");
        } else {
            System.out.println("Welcome!");
        }
    }
}
