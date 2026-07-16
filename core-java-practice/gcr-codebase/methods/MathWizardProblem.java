import java.util.Scanner;

class MathWizardProblem {

    int instanceVariable = 100;

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScope() {
        int localVariable = 50;

        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard mw = new MathWizard();

        System.out.print("Enter a number for Prime Check: ");
        int n = sc.nextInt();
        System.out.println("Is Prime: " + mw.isPrime(n));

        System.out.print("Enter a number for Factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial: " + mw.factorial(factNum));

        System.out.print("Enter a double number for Overloaded Factorial: ");
        double d = sc.nextDouble();
        System.out.println("Factorial(Double): " + mw.factorial(d));

        System.out.print("Enter Fibonacci Position: ");
        int fib = sc.nextInt();
        System.out.println("Fibonacci Number: " + mw.fibonacci(fib));

        System.out.print("Enter two numbers for GCD and LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + mw.gcd(a, b));
        System.out.println("LCM: " + mw.lcm(a, b));

        System.out.print("Enter Base and Exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println("Power: " + mw.power(base, exp));

        mw.showScope();

        sc.close();
    }
}