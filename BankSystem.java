import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name) {
        this.accountHolder = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance. Available: ₹" + balance);
            }
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount); // Handled in class

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount); // Handled in class

        account.checkBalance();

        System.out.println("Thank you, " + name + "!");
    }
}
