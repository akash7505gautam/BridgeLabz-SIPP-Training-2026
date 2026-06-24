abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Abstract Method
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("Akash");
        sa.setBalance(10000);
        sa.setInterestRate(5);

        sa.deposit(2000);
        sa.withdraw(1000);

        System.out.println("Savings Account Details:");
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA101");
        ca.setHolderName("Rahul");
        ca.setBalance(15000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(3000);
        ca.withdraw(2000);

        System.out.println("Current Account Details:");
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}