package oop_basics_exercises;

/* Define a class to represent a bank account. Include attributes and methods for initial 
values, deposits, withdrawals (checking the balance), and displaying name and balance. */

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;

    public void initialize(String holder, String number, String type, double initialBalance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.accountType = type;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.initialize("Olga", "100000", "Savings", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.display();
    }
}
