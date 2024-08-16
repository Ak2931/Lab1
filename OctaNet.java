package assignment27;

import java.util.ArrayList;
import java.util.Scanner;

class ATM {
    
    float balance;  // Variable to store account balance
    int PIN = 2931; // Default PIN for the ATM
    ArrayList<String> transactionHistory = new ArrayList<>(); // List to store transaction history
    
    // Method to check the entered PIN
    public void checkPin() {
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        
        // Verify the entered PIN
        if (enteredPin == PIN) {
            menu(); // Show menu if PIN is correct
        } else {
            System.out.println("Invalid PIN. Please try again.");
            checkPin(); // Retry if PIN is incorrect
        }
    }
    
    // Method to display the ATM menu
    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. View transaction history");
        System.out.println("5. Change PIN");
        System.out.println("6. Exit");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        // Perform actions based on the user's choice
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                viewTransactionHistory();
                break;
            case 5:
                changePIN();
                break;
            case 6:
                System.out.println("Exiting...");
                return; // Exit the menu
            default:
                System.out.println("Invalid choice. Please try again.");
                menu(); // Show menu again for invalid choice
        }
    }
    
    // Method to check and display the account balance
    public void checkBalance() {
        System.out.println("Balance: $" + balance);
        transactionHistory.add("Checked balance: $" + balance);
        menu(); // Return to menu after displaying balance
    }
    
    // Method to withdraw money from the account
    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        
        // Check if there are sufficient funds for the withdrawal
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Money withdrawal successful.");
            transactionHistory.add("Withdrew: $" + amount);
        }
        menu(); // Return to menu after withdrawal
    }
    
    // Method to deposit money into the account
    public void depositMoney() {
        System.out.println("Enter amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        
        balance += amount;
        System.out.println("Money deposited successfully.");
        transactionHistory.add("Deposited: $" + amount);
        menu(); // Return to menu after deposit
    }
    
    // Method to view transaction history
    public void viewTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        menu(); // Return to menu after displaying transaction history
    }
    
    // Method to change the PIN
    public void changePIN() {
        System.out.println("Enter your current PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        
        // Verify the current PIN
        if (enteredPin == PIN) {
            System.out.println("Enter new PIN (4 digits):");
            int newPin = sc.nextInt();
            
            // Ensure new PIN is exactly 4 digits
            if (newPin >= 1000 && newPin <= 9999) {
                PIN = newPin;
                System.out.println("PIN changed successfully.");
                transactionHistory.add("Changed PIN");
            } else {
                System.out.println("Invalid PIN. PIN must be 4 digits.");
            }
        } else {
            System.out.println("Incorrect current PIN.");
        }
        menu(); // Return to menu after PIN change
    }
}

public class OctaNet {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin(); // Start the ATM process by checking the PIN
    }
}
