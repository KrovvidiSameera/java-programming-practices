class Account {
    int accountNumber;
    double balance;
    String accountType;
    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }
    void calculateInterest() {
        System.out.println("No interest");
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;
    SavingsAccount(int no, double balance, double rate) {
        super(no, balance, "Savings Account");
        interestRate = rate;
    }
    @Override
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest: " + interest);
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;
    CurrentAccount(int no, double balance, double limit) {
        super(no, balance, "Current Account");
        overdraftLimit = limit;
    }
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Exceeds overdraft limit");
    }
}
public class BankManagementSystem {
    static void transfer(Account from, Account to, double amount) {
        if (amount > 0 && amount <= from.balance) {
            from.balance -= amount;
            to.balance += amount;
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed");
        }
    }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2002, 500000, 3);
        CurrentAccount current = new CurrentAccount(2003, 5000, 3000);
        savings.display();
        savings.deposit(3000);
        savings.calculateInterest();
        current.display();
        current.withdraw(6000);
        transfer(savings, current, 2000);
        savings.display();
        current.display();
    }
}
