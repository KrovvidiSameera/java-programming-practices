package javacore;

// Account class represents a general bank account
class Account {

    // Data members of the Account class
    int accountNumber;
    double balance;
    String accountType;


    // Parameterized constructor to initialize account details
    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }


    // Method to deposit money into the account
    void deposit(double amount) {

        // Check whether the deposit amount is positive
        if (amount > 0)
            balance += amount;
    }


    // Method to withdraw money from the account
    void withdraw(double amount) {

        // Check whether the amount is valid and balance is sufficient
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }


    // Method to calculate interest
    // Default implementation for a general account
    void calculateInterest() {
        System.out.println("No interest");
    }


    // Method to display account details
    void display() {

        // Display account number
        System.out.println("Account Number: " + accountNumber);

        // Display account type
        System.out.println("Account type: " + accountType);

        // Display current balance
        System.out.println("Balance: " + balance);
    }
}


// SavingsAccount class inherits Account
class SavingsAccount extends Account {

    // Interest rate for savings account
    private double interestRate;


    // Constructor to initialize savings account
    SavingsAccount(int no, double balance, double rate) {

        // Calling parent class constructor
        super(no, balance, "Savings Account");

        // Assigning interest rate
        interestRate = rate;
    }


    // Overriding calculateInterest() method
    @Override
    void calculateInterest() {

        // Calculating interest based on current balance
        double interest = balance * interestRate / 100;

        // Adding interest to the account balance
        balance += interest;

        // Displaying calculated interest
        System.out.println("Interest: " + interest);
    }
}


// CurrentAccount class inherits Account
class CurrentAccount extends Account {

    // Maximum overdraft amount allowed
    private double overdraftLimit;


    // Constructor to initialize current account
    CurrentAccount(int no, double balance, double limit) {

        // Calling parent class constructor
        super(no, balance, "Current Account");

        // Assigning overdraft limit
        overdraftLimit = limit;
    }


    // Overriding withdraw() method to support overdraft
    @Override
    void withdraw(double amount) {

        // Check whether withdrawal is within overdraft limit
        if (amount > 0 && amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Exceeds overdraft limit");
    }
}


// Main class of the Bank Account Management System
public class BankAccountManagement {


    // Static method to transfer money between two accounts
    static void transfer(Account from, Account to, double amount) {

        // Check whether transfer amount is valid
        // and sufficient balance is available
        if (amount > 0 && amount <= from.balance) {

            // Deduct amount from source account
            from.balance -= amount;

            // Add amount to destination account
            to.balance += amount;

            // Display successful transfer message
            System.out.println("Transfer successful");

        } else {

            // Display message when transfer fails
            System.out.println("Transfer failed");
        }
    }


    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating a SavingsAccount object
        SavingsAccount savings =
                new SavingsAccount(2002, 500000, 3);


        // Creating a CurrentAccount object
        CurrentAccount current =
                new CurrentAccount(2003, 5000, 3000);


        // Displaying initial savings account details
        savings.display();


        // Depositing Rs.3000 into savings account
        savings.deposit(3000);


        // Calculating and adding interest
        savings.calculateInterest();


        // Displaying initial current account details
        current.display();


        // Withdrawing Rs.6000 using overdraft facility
        current.withdraw(6000);


        // Transferring Rs.2000 from savings to current account
        transfer(savings, current, 2000);


        // Displaying savings account details after transactions
        savings.display();


        // Displaying current account details after transactions
        current.display();
    }
}
