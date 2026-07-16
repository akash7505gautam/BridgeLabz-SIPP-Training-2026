import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
    //A kingdom's tax system charges 5% for income <10K, 15% for 10K–
    // 50K, 30% above 50K. Read a citizen's income, print tax bracket and
    // amount. Extend: loop over an array of 10 citizens and tally total tax
    // collected.
        Scanner sc = new Scanner(System.in);
        double totalTax = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter income of citizen " + i + ": ");
            double income = sc.nextDouble();
            double amount = 0;
            if (income < 10000) {
                amount = income * 0.05;
                System.out.println("Tax on income " + income +
                        " is: 5% and amount is: " + amount);
            }
            else if (income <= 50000) {
                amount = income * 0.15;
                System.out.println("Tax on income " + income +
                        " is: 15% and amount is: " + amount);
            }
            else {
                amount = income * 0.30;
                System.out.println("Tax on income " + income +
                        " is: 30% and amount is: " + amount);
            }
            totalTax += amount;
        }
        System.out.println("\nTotal Tax Collected = " + totalTax);
    }   
}