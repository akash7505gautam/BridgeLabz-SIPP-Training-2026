import java.util.Scanner;

public class FactorsUtility {

    // Find factors and return array
    public static int[] getFactors(int number) {

        int count = 0;

        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Greatest factor excluding itself
    public static int greatestFactor(int[] factors) {

        if (factors.length < 2)
            return 1;

        return factors[factors.length - 2];
    }

    // Sum of factors
    public static int sumFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Product of factors
    public static long productFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Product of cubes of factors
    public static double productOfCubes(int[] factors) {

        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest Factor = "
                + greatestFactor(factors));

        System.out.println("Sum of Factors = "
                + sumFactors(factors));

        System.out.println("Product of Factors = "
                + productFactors(factors));

        System.out.println("Product of Cubes = "
                + productOfCubes(factors));

        sc.close();
    }
}