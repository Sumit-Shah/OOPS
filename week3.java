import java.util.*;

class Week3 {

    // 8.	Create a Java program that sorts an array of integers 
    // in ascending order using the bubble sort algorithm.

//     public static void bubbleSort(int arr[]) {
//     for (int turn = 0; turn < arr.length - 1; turn++) {
//         for (int j = 0; j < arr.length - 1 - turn; j++) {
//             if (arr[j] > arr[j + 1]) {
//                 // SWAP
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }

// public static void printArr(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[] = {5, 4, 1, 2, 3};
//     bubbleSort(arr);
//     printArr(arr);
// }








// 10.	Write a Java program that uses the enhanced for loop to 
// find the maximum value in an array of doubles.

// public static double getLargest(double numbers[]){
//     double largest = Integer.MIN_VALUE;
//     double smallest = Integer.MAX_VALUE;

//     for(double i=0; i<numbers.length; i++) {
//         if(largest < numbers[i]) {
//             largest = numbers[i];
//         }
//         if(smallest > numbers[i]) {
//             smallest = numbers[i];
//         }
//     }
//     System.out.println("Smallest value is : " + smallest);
//     return largest;
// }    
// public static void main(String args[]) {
//     double numbers[] = {1.2, 2.5, 3.6, 4.7, 5.8, 20.9};
//     System.out.println("rgest value is : " + getLargest(numbers));  
// }







    // public class LargestSmallestFinder {

    // // Method to find the largest value in an array and print the smallest
    // public static int getLargest(int numbers[]) {
    //     // Initialize the largest variable with the smallest possible integer value
    //     int largest = Integer.MIN_VALUE;
    //     // Initialize the smallest variable with the largest possible integer value
    //     int smallest = Integer.MAX_VALUE;

    //     // Loop through each element in the array
    //     for (int i = 0; i < numbers.length; i++) {
    //         // Check if the current element is greater than the current largest
    //         if (largest < numbers[i]) {
    //             // Update the largest if the current element is greater
    //             largest = numbers[i];
    //         }
    //         // Check if the current element is smaller than the current smallest
    //         if (smallest > numbers[i]) {
    //             // Update the smallest if the current element is smaller
    //             smallest = numbers[i];
    //         }
    //     }

    //     // Print the smallest value
    //     System.out.println("Smallest value is : " + smallest);

    //     // Return the largest value after the loop completes
    //     return largest;
    // }

    // // Main method
    // public static void main(String[] args) {
    //     // Array of numbers
    //     int numbers[] = {1, 2, 3, 4, 5, 20};

    //     // Call the getLargest method and print the result
    //     System.out.println("Largest value is : " + getLargest(numbers));
    // }
// }






// public class LargestSmallestFinder {

//     // Method to find the largest value in an array and print the smallest
//     public static double getLargest(double numbers[]) {
//         // Initialize the largest variable with the smallest possible double value
//         double largest = Double.MIN_VALUE;
//         // Initialize the smallest variable with the largest possible double value
//         double smallest = Double.MAX_VALUE;

//         // Loop through each element in the array
//         for (double num : numbers) {
//             // Check if the current element is greater than the current largest
//             if (largest < num) {
//                 // Update the largest if the current element is greater
//                 largest = num;
//             }
//             // Check if the current element is smaller than the current smallest
//             if (smallest > num) {
//                 // Update the smallest if the current element is smaller
//                 smallest = num;
//             }
//         }

//         // Print the smallest value
//         System.out.println("Smallest value is: " + smallest);

//         // Return the largest value after the loop completes
//         return largest;
//     }

//     // Main method
//     public static void main(String args[]) {
//         // Array of numbers
//         double numbers[] = {1.2, 2.5, 3.6, 4.7, 5.8, 20.9};

//         // Call the getLargest method and print the result
//         System.out.println("Largest value is: " + getLargest(numbers));
//     }
// }











public class ArraySumCalculator {

    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of all elements using an enhanced for loop
        int sum = calculateSum(matrix);

        // Print the result
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }

    // Method to calculate the sum of all elements in a 2D array
    public static int calculateSum(int[][] array) {
        int sum = 0;

        // Use enhanced for loops to iterate through the rows and columns
        for (int[] row : array) {
            for (int element : row) {
                // Add each element to the sum
                sum += element;
            }
        }

        // Return the final sum
        return sum;
    }
}


}

