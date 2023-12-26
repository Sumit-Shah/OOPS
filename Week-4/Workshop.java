import  java.util.*;
public interface Workshop {
    
    
// Basics of Classes and Objects:
// Define a class named BankAccount with attributes accountNumber, balance, and accountHolderName, accountHolderAddress. 
// Create an object of this class and initialize its attributes.


// public class BankAccount {
//     // Attributes
//     String accountNumber;
//     double balance;
//     String accountHolderName;

//     // Constructor
//     public BankAccount() {
//         // Default constructor, no parameters
//     }

//     // Driver class
//     public static void main(String[] args) {
//         BankAccount bank = new BankAccount();
//         bank.accountHolderName = "SUMIT SHAH";
//         bank.balance = 100000;
//         bank.accountNumber = "9818257300";
//     }
// }






// Methods:
// Create a method, depositMoney() in the BankAccount class to deposit money.
//  Implement another method, withdrawMoney() to withdraw money. 
// (The current balance should also be printed).

// public class BankAccount {
//     // Attributes
//     String accountNumber;
//     double balance;
//     String accountHolderName;

//     // Constructor
//     public BankAccount(String accountNumber, double balance, String accountHolderName) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//     }

//     // Method to deposit money
//     public void depositMoney(double amount) {
//         balance += amount;
//         System.out.println("Deposit Successful");
//         printBalance();
//     }

//     // Method to withdraw money
//     public void withdrawMoney(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawal Successful");
//             printBalance();
//         } else {
//             System.out.println("Insufficient funds. Withdrawal unsuccessful.");
//         }
//     }

//     // Method to print current balance
//     private void printBalance() {
//         System.out.println("Current Balance: " + balance);
//     }

//     // Driver class
//     public static void main(String[] args) {
//         BankAccount bank = new BankAccount("9818257300", 100000, "SUMIT SHAH");

//         // Deposit money
//         bank.depositMoney(50000);

//         // Withdraw money
//         bank.withdrawMoney(20000);
//         bank.withdrawMoney(100000);  // Attempt to withdraw more than the balance
//     }
// }








// Create a class Lamp with attributes isOn to store boolean value. Also create a method turnOn() to turn on the light, and turnOff() to turn off the light and print the on status of the light. 
public class Lamp {
    // Attribute to store the on/off status
    private boolean isOn;

    // Method to turn on the light
    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned ON");
    }

    // Method to turn off the light
    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned OFF");
    }

    // Method to check the on status of the light
    public void checkStatus() {
        System.out.println("Light is " + (isOn ? "ON" : "OFF"));
    }

    // Driver class for testing
    public static void main(String[] args) {
        Lamp myLamp = new Lamp();

        // Initial status
        myLamp.checkStatus();

        // Turn on the light
        myLamp.turnOn();

        // Check status after turning on
        myLamp.checkStatus();

        // Turn off the light
        myLamp.turnOff();

        // Check status after turning off
        myLamp.checkStatus();
    }
}








// Constructors:
// Implement a parameterized constructor for the BankAccount class that initializes the account attributes. Create an object using this constructor.
// Implement a no-argument constructor that prints out “User created!” as soon as the instance of the user is created.



// Constructor Overloading:
// Create a class named ,”Box” with attributes width, height, and depth. Create multiple constructors for handling following object declarations. Also declare a method getVolume() that prints the  volume of the declared:
// For a cube, declare a constructor to take length only.
// For a cuboid, declare a constructor to take length, breadth, and height.
// For no parameter, declare a no-argument constructor that sets length = 10, breadth = 8, and height = 12.

// Access Modifiers:
// Set the balance attribute in the BankAccount class as private. Provide public getter methods for the balance.
// Encapsulation:
// Create a class Address with private attributes street, city, and zipCode. Use encapsulation and provide getter method.


// Combining Concepts:
// Create a class Customer with private attributes customerId, name, and a BankAccount attribute. Implement a parameterized constructor and encapsulate the attributes. Provide getter method. Instantiate multiple Customer objects with different values and demonstrate the use of getters and setters.
// Constructors Overloading:
// Implement multiple constructors for the BankAccount class with different parameter sets. Use constructor overloading to create objects with different initialization scenarios.



}
