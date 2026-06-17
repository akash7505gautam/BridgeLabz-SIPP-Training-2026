class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class ATMWithdrawal {
    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available: ₹" + balance +
                ", Requested: ₹" + amount);
        }
        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: ₹" + (balance - amount));
    }
    public static void main(String[] args) {
        double balance = 5000;
        double withdrawalAmount = 8000;
        try {
            withdraw(balance, withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}