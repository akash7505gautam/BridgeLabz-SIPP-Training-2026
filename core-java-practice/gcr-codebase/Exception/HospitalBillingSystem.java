import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class HospitalBillingSystem {
    public static void processPayment(double billAmount, double paymentAmount)
            throws InsufficientFundsException {
        if (paymentAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds. Required ₹" + billAmount +
                    ", Available ₹" + paymentAmount);
        }
        System.out.println("Payment Successful.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());
            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());
            double averageCost = totalBill / items;
            System.out.println("Average Cost Per Item: ₹" + averageCost);
            String[] patients = {"Amit", "Riya", "Rahul"};
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Patient Name: " + patients[index]);
            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());
            processPayment(totalBill, payment);
        } catch (ArithmeticException e) {
            System.out.println("Billing Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient Error: Invalid patient index entered.");
        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter valid numeric values.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            System.out.println("Hospital billing process completed.");
        }
    }
}