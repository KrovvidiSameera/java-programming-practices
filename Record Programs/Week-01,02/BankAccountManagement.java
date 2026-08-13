class Account {

    int accountNumber;
    String accountType;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
public class BankMangementSystem {
    public static void main(String[] args) {
        Account a = new Account();
        a.accountNumber = 101;
        a.accountType = "Savings";
        a.balance = 5000;
        a.display();
        a.deposit(2000);
        a.withdraw(1000);
        System.out.println("\nAfter Transactions:");
        a.display();
    }
}
