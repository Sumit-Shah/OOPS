// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Get user input
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Check if the sum of digits is even
//         boolean isSumEven = isSumOfDigitsEven(number);

//         // Display the result
//         System.out.println("The sum of digits is even: " + isSumEven);
//     }

//     // Function to check if the sum of digits is even
//     public static boolean isSumOfDigitsEven(int num) {
//         int sum = 0;

//         // Calculate the sum of digits
//         while (num != 0) {
//             int digit = num % 10;
//             sum += digit;
//             num /= 10;
//         }

//         // Check if the sum is even
//         return sum % 2 == 0;
//     }
// }

















// 8.	Write a program to print a Diamond shape of a number, the number should be imputed as a user input.
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Get user input
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         // Print diamond shape
//         printDiamond(num);
//     }

//     // Function to print diamond shape of a number
//     public static void printDiamond(int n) {
//         // Upper part of the diamond
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }

//         // Lower part of the diamond
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }












// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter an odd number:");
        // n = sc.nextInt();
        // if (n%2 != 0){
//             // for (int i = 1; i <= num; i += 2) {
//             //     int spaces = (num - i) / 2;
//             //     for (int j = 0; j < spaces; j++) {
//             //         System.out.print(" ");
//             //     }
//             //     for (int j = 0; j < i; j++) {
//             //         System.out.print("*");
//             //     }
//             //     System.out.println();
//             // }
//             // for (int i = num-2; i > 0; i -= 2) {
//             //     int spaces = (num - i) / 2;
//             //     for (int j = 0; j < spaces; j++) {
//             //         System.out.print(" ");
//             //     }
//             //     for (int j = 0; j < i; j++) {
//             //         System.out.print("*");
//             //     }
//             //     System.out.println();
//             // }
        // }else{
        //      System.out.println("Diamond cannot be created with the input number!");
        // }
        // sc.close();
//     }

    // for(int i=1; j<=n; i++) {
    //     //1st half
    //     for(int i=1; i<=n; i++){
    //         //spaces
    //         for(int j=1; j<=(n-1); j++) {
    //             System.out.println(" ");
    //         }

    //         //stars
    //         for (int j=1; j<=(2*i)-1; j++) {
    //             System.out.println("*");
    //         }
    //     }
//     }
// }



// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.println("Enter an odd number:");
//         n = sc.nextInt();
//         if (n%2 != 0){
//         }else{
//             System.out.println("Diamond cannot be created with the input number!");
//        }
//        sc.close();
        
//     }
//     public static void diamond(int n) {
//         //1st half
//         for(int i=1; i<=n; i++){
//             //spaces
//             for(int j=1; j<=(n-1); j++) {
//                 System.out.println(" ");
//             }

//             //stars
//             for (int j=1; j<=(2*i)-1; j++) {
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//         //2nd half
//         for(int i=n; i>=n; i--){
//             //spaces
//             for(int j=1; j<=(n-1); j++) {
//                 System.out.println(" ");
//             }

//             //stars
//             for (int j=1; j<=(2*i)-1; j++) {
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
        
//     }

// }













import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter an odd number:");
        n = sc.nextInt();
        if (n % 2 != 0) {
            // Call the diamond function only if n is an odd number
            diamond(n);
        } else {
            System.out.println("Diamond cannot be created with the input number!");
        }
        sc.close();
    }

    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
