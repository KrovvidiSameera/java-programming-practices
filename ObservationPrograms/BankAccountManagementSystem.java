package javacore;
// Account class represents a bank account
class Account {

    // Data members of the Account class
    int accountNumber;
    String accountType;
    double balance;


    // Method to deposit money into the account
    void deposit(double amount) {

        // Adding deposit amount to the balance
        balance = balance + amount;

        // Displaying deposited amount
        System.out.println("Deposited: " + amount);
    }


    // Method to withdraw money from the account
    void withdraw(double amount) {

        // Checking whether sufficient balance is available
        if (amount <= balance) {

            // Deducting withdrawal amount from balance
            balance = balance - amount;

            // Displaying withdrawn amount
            System.out.println("Withdrawn: " + amount);

        } else {

            // Displaying message when balance is insufficient
            System.out.println("Insufficient balance");
        }
    }


    // Method to display account details
    void display() {

        // Displaying account number
        System.out.println("Account Number: " + accountNumber);

        // Displaying account type
        System.out.println("Account Type: " + accountType);

        // Displaying account balance
        System.out.println("Balance: " + balance);
    }
}


// Main class of the Bank Management System
public class BankMangementSystem {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an object of Account class
        Account a = new Account();

        // Assigning account number
        a.accountNumber = 101;

        // Assigning account type
        a.accountType = "Savings";

        // Assigning initial account balance
        a.balance = 5000;

        // Displaying initial account details
        a.display();


        // Depositing Rs.2000 into the account
        a.deposit(2000);

        // Withdrawing Rs.1000 from the account
        a.withdraw(1000);


        // Displaying account details after transactions
        System.out.println("\nAfter Transactions:");
        a.display();
    }
}
