public class BankAccount {
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
