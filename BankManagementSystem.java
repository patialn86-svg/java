import java.util.ArrayList;
import java.util.Scanner;

// Bank Account Class
class BankAccount {

    // Private Data Members (Encapsulation)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter Methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Account Details
    public void displayAccount() {

        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}

// Main Class
public class BankManagementSystem {

    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Create Account
    public static void createAccount() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        accounts.add(account);

        System.out.println("Account Created Successfully!");
    }

    // Find Account
    public static BankAccount findAccount(int accNo) {

        for (BankAccount acc : accounts) {

            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }

        return null;
    }

    // Deposit Money
    public static void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();

            acc.deposit(amount);

        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Withdraw Money
    public static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);

        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Check Balance
    public static void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if (acc != null) {

            System.out.println("Current Balance: " + acc.getBalance());

        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Display Account Details
    public static void displayDetails() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if (acc != null) {

            acc.displayAccount();

        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Main Method
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayDetails();
                    break;

                case 6:
                    System.out.println("Thank You for Using Bank Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}