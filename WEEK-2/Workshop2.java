import java.util.*;
import java.util.Scanner;
public class Workshop2{
        //     Object Oriented Design and Programming                                              

        // Workshop2

        //         Go through the questions below and answer the questions:

        // Taking length and breadth of a rectangle from user and check if it is square or not.

        // A college has following rules for grading system:
        // a. 40 to 50 - C
        // b. 50 to 60 - C+
        // c. 60 to 70 - B
        // d. 70 to 80 - B+
        // e. 80 to 90 - A
        // f. Above 90 - A+
        // Ask user to enter marks and print the corresponding grade using if-else-if statement.

        // Determine oldest and youngest among the people taking the using input.

        // If
        // x = 2
        // y = 5
        // z = 0
        // then find values of the following expressions:
        // a. x == 2
        // b. x != 5
        // c. x != 5 && y >= 5
        // d. z != 0 || x == 2
        // e. !(y < 10)
        // Ask student if he/she has medical cause or not ( 'y or 'n' ). if (‘y’) print you are not allowed to sit in the exam  and if(‘n’’) print you can sit in the exam.


        // Write a program to check the odd and even numbers using user input.


        // Write a program to print the value of x ,if and only if the value of x is x>5 and less x<15 taking user input.

        // Assuming the value: x=20,y=15,z=10.Complete the code below and observe the result. 
        // if (x > y) 
        // {
        //     if (y > z){  System.out.println("x is greater than y and z");}    // statement1.
        // }
        // else
        // System.out.println("x is less than or equal to y"); // statement2.








        // A college has following rules for grading system:
        // a. grade -A+      print ("Excellent !")
        // b. grade -A        print ("Outstanding !")
        // c. grade -B+      print ("Good !")
        // d. grade -B        print ("Can do better !")
        // e. grade -C+      print ("Just Passed !")
        // f.  grade -C         print ("You Failed !")
        //                             print ("Invalid grade!") for default case
        // Ask user to enter grade  and print the corresponding grade using switch statement

        // Run the code below and observe how the break statement works.
        // class Student {
        //     public static void main(String[] args) {
        //         int roll_no = 12;    
        //         switch (i) {
        //             case 1:
        //                 System.out.println("Your roll number is 10");
        //                 break;
        //             case 2:
        //                 System.out.println("Your roll number is 12");
        //                 break;
        //             default:
        //                 System.out.println("Your roll number is greater than 12");
        //         }
        //     }
        // }




        // Write a program to take two string user input and perform the following string methods and observe the result
        // length()
        // compareTo()
        // charAt()
        // substring()
        // Equals
        // toUpperCase()
        // toLowerCase()
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the first String : ");
        //     String one = sc.nextLine();
        //     System.out.println("Enter the Second String : ");
        //     String two = sc.nextLine();
        //     System.out.println(one.compareTo(two));
        //     System.out.println(length(one));
        //     System.out.println(charAt(0));
        //     sc.close();
        // }

        public static void main(String[] args) {

            // c. Convert the array of Character to string
            char [] ch =  {'S', 'U', 'M', 'I', 'T'};
            String name = new String(ch);
            System.out.println(name);
        
            // d. Declare a String using Double Quotation (“”)
            String s1 = "SUMIT ";
            String s2 = "SHAH";
            System.out.println(s1+s2);
        
            }


            
}