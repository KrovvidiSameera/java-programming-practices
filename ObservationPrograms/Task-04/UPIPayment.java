package javacore;
public class MainUPIPayment {// PaymentService Interface
    interface PaymentService {

        void pay(String upiId, double amount);

        void checkBalance();
    }


    // Custom Exception for insufficient balance
    static class InsufficientBalanceException extends Exception {

        public InsufficientBalanceException(String message) {
            super(message);
        }
    }


    // Custom Exception for invalid UPI ID
    static class InvalidUPIException extends Exception {

        public InvalidUPIException(String message) {
            super(message);
        }
    }


    // Custom Exception for invalid amount
    static class InvalidAmountException extends Exception {

        public InvalidAmountException(String message) {
            super(message);
        }
    }


    // Wallet Class
    static class Wallet {

        // Private data members to demonstrate encapsulation
        private String userName;
        private String mobileNumber;
        private String upiId;
        private double balance;

        // Constructor
        public Wallet(String userName, String mobileNumber, String upiId) {
            this.userName = userName;
            this.mobileNumber = mobileNumber;
            this.upiId = upiId;
            this.balance = 0.0;
        }

        // Method to add money
        public void addMoney(double amount) {

            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Money added successfully: ₹" + amount);
            } else {
                System.out.println("Invalid amount.");
            }
        }

        // Method to get balance
        public double getBalance() {
            return balance;
        }

        // Method to deduct money
        public void deductMoney(double amount) {
            balance = balance - amount;
        }

        // Method to display wallet details
        public void displayWalletDetails() {

            System.out.println("\n----- Wallet Details -----");
            System.out.println("User Name    : " + userName);
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("UPI ID       : " + upiId);
            System.out.println("Balance      : ₹" + balance);
        }
    }


    // UPI Payment Class
    static class UPIPayment implements PaymentService {

        private Wallet wallet;

        // Constructor
        public UPIPayment(Wallet wallet) {
            this.wallet = wallet;
        }

        // Pay method
        @Override
        public void pay(String upiId, double amount) {

            try {

                // Validate UPI ID
                if (upiId == null ||
                        !upiId.contains("@") ||
                        upiId.startsWith("@") ||
                        upiId.endsWith("@")) {

                    throw new InvalidUPIException(
                            "Invalid UPI ID: " + upiId
                    );
                }

                // Validate payment amount
                if (amount <= 0) {

                    throw new InvalidAmountException(
                            "Payment amount must be greater than zero."
                    );
                }

                // Check sufficient balance
                if (amount > wallet.getBalance()) {

                    throw new InsufficientBalanceException(
                            "Insufficient balance for this payment."
                    );
                }

                // Deduct payment amount
                wallet.deductMoney(amount);

                System.out.println("\nPayment Successful!");
                System.out.println("Receiver UPI ID: " + upiId);
                System.out.println("Amount Paid     : ₹" + amount);

            }

            catch (InvalidUPIException e) {

                System.out.println("Transaction Failed: "
                        + e.getMessage());

            }

            catch (InvalidAmountException e) {

                System.out.println("Transaction Failed: "
                        + e.getMessage());

            }

            catch (InsufficientBalanceException e) {

                System.out.println("Transaction Failed: "
                        + e.getMessage());

            }

            finally {

                System.out.println("Transaction processing completed.");
            }
        }


        // Check balance method
        @Override
        public void checkBalance() {

            System.out.println(
                    "Available Wallet Balance: ₹"
                            + wallet.getBalance()
            );
        }
    }
