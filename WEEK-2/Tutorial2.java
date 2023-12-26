import java.net.Socket;
import java.util.Scanner;

public class Tutorial2{
    // public static void main(String[] args) {
    //     System.out.println("Workshop2");
    // }




        // Task 1
        // Given:
        //  expr1 = (5>3), expr2 = (8>5) -> use it for Logical AND.
        //  expr1 = (5>3), expr2 = (2>5) -> use it for Logical OR.
        //  expr1 = (!(5==10)) -> use it for Logical NOT.
        // Write a program for computing above data using all the
        // comparison operators given in the slides.

    // public static void main(String[] args) {
    //      expr1 = (5>3), expr2 = (8>5) -> use it for Logical AND.
    //     boolean expr1 = (5>3);
    //     boolean expr2 = (8>5);
    //     boolean result = (expr1 && expr2);
    //     System.out.println(result);


    //      expr1 = (5>3), expr2 = (2>5) -> use it for Logical OR.
    //     boolean expr1 = (5>3);
    //     boolean expr2 = (2>5);
    //     boolean result = (expr1 || expr2);
    //     System.out.println(result);


    //      expr1 = (!(5==10)) -> use it for Logical NOT.
    //     boolean expr1 = (!(5==10));
    //     System.out.println(expr1);
    // }

    




        // Task 2
        // a. Declare a character and assign a value
        // b. Declare an array of Character with 3 values.
        // c. Convert the array of Character to string
        // d. Declare a String using Double Quotation (“”)
        // e. Declare a String Class (new String())

    // public static void main(String[] args) {

    // // c. Convert the array of Character to string
    char [] ch =  {'S', 'U', 'M', 'I', 'T'};
    String name = new String(ch);
    System.out.println(name);

    // d. Declare a String using Double Quotation (“”)
    String s1 = "SUMIT ";
    String s2 = "SHAH";
    System.out.println(s1+s2);

    }




    // Task 3
    // compareTo()
    // Compare ‘s1 and s2’ , ‘s1 and s3’ ,‘s1 and s4’ , ‘s1 and s5’
    // ,’s1 and s6’
    //  String s1="hello";
    //  String s2="hello";
    //  String s3="harry";
    //  String s4="nepal";
    //  String s5="flag";
    //  String s6="";


    // public static void main(String [] args) {
    //     String s1="hello";
    //     String s2="hello";
    //     String s3="harry";
    //     String s4="nepal";
    //     String s5="flag";
    //     String s6=""; 

    //     System.out.println(s1.compareTo(s2));
    //     System.out.println(s1.compareTo(s3));
    //     System.out.println(s1.compareTo(s4));
    //     System.out.println(s1.compareTo(s5));
    //     System.out.println(s1.compareTo(s6));
    // }




    // Task 4
    // Write a Java program to read the Birth year (in AD) of a
    // candidate and determine whether he is eligible to cast
    // his/her own vote. (if the user is 18 he can cast vote). 

    // public static void main(String[] args) {
    //     System.out.print("Enter the age in A.D :  ");
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     String result = (age < 18) ? ("IS NOT ELIGIBLE TO CASTE THE VOTE .") : ("IS ELIGIBLE TO CASTE THE VOTE.");
    //     System.out.println(result);
    //     sc.close();

    // }




    // Task 5
    // Write a program to find the greatest among two numbers
    // taking user input.
    // public static void main(String[] args) {
    // System.out.print("Enter First Number : ");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // System.out.print("Enter The Second number : ");
    // int b = sc.nextInt();
    // String result = (a > b) ? ("First Number Is Greter.") : ("Second Number Is  Greater.");
    // System.out.println(result);
    // sc.close();
    // }






    // Task 6
    // Write a Java program to find the largest of three numbers.
    // Take 3 numbers as input from user. Hint: use nested-if
    // statement
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter First Number : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter Second  Number : ");
    //     int b = sc.nextInt();
    //     System.out.print("Enter Third  Number : ");
    //     int c = sc.nextInt();
    //     if (a>b && a>c) {
    //         System.out.println("First Number Is Largest. ");
    //         if(b>a && b>c) {
    //             System.out.println("Second NUmber Is Largest. ");
    //         } 
    //         else {
    //         System.out.println("Third Number Is Largest.");
    //         }
    //     }
    // 

    // }







    // Task 7
    // Find the grade of the student using following data.Using
    // if-else-if ladder. Using user input. Use if-else-if statement.
    // ❏   Condition 1: (Marks<50) -> print(fail)
    // ❏  Condition 2: ( Marks>=50 && Marks<60) -> print(“C grade”)
    // ❏  Condition 3: (Marks>=60 && Marks<70) ->print(“B grade”)
    // ❏ Condition 4: print(“A grade”)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Marks : ");
    //     int marks = sc.nextInt();
    //     if (marks < 50) {
    //         System.out.println("FAILL");
    //     } else if(marks >= 50 && marks<60) {
    //         System.out.println("C grade.");
    //     } else if(marks >= 60 && marks <70) {
    //         System.out.println("B grade.");
    //     }else {
    //         System.out.println("A grade.");
    //     }
        
    //     sc.close();
        
    // }





//     Task 8
//     Write a program to Check whether a character is a vowel
//     or consonant using switch statement.
        // public static void main(String [] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter The Character : ");
        //     char ch = sc.next().charAt(0);
        //     switch (ch) {
        //         case 'a':
        //         case 'e':
        //         case 'i':
        //         case 'o':
        //         case 'u':
        //         case 'A':
        //         case 'E':
        //         case 'I':
        //         case 'O':
        //         case 'U':
        //             System.out.println(ch + " : IS VOWEL"); 
        //             break;
        //         default:
        //             System.out.println(ch + " : IS CONSONANT");
        //             break;
        //     }
        //     sc.close();
        // }







//         Task 9
//         Write a program to print day of the week using switch
//         statement.
//         (if day = 1, print Sunday; ……., day = 7, print Saturday; else
//          print “Invalid input!”
            // public static void main(String[] args) {
            //     Scanner sc = new Scanner(System.in);
            //     System.out.print("Enter a number (1-7) : ");
            //     int week = sc.nextInt();
            //     switch (week) {
            //         case 1: 
            //             System.out.print("SUNDAY");
            //             break;
            //         case 2: 
            //             System.out.print("MONDAY");
            //             break;
            //         case 3: 
            //             System.out.print("TUESDAY");
            //             break;
            //         case 4: 
            //             System.out.print("WEDNESDAY");
            //             break;
            //         case 5: 
            //             System.out.print("THURSDAY");
            //             break;
            //         case 6: 
            //             System.out.print("FRIDAY");
            //             break;
            //         case 7: 
            //             System.out.print("SATURDAY");
            //             break;
            //         default:
            //             System.out.println("PLEASE ENTER 1-7.");
            //             break;
            //     }
            //     sc.close();
            // }


//             Object Oriented Design and Programming                                              

// Workshop2

//           Go through the questions below and answer the questions:

// Taking length and breadth of a rectangle from user and check if it is square or not.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) {
    System.out.print("Enter the length. : ");
    int l = sc.nextInt();
    System.out.print("Enter the breath. : ");
    int b = sc.nextInt();
    String result = (l = b) ? ("It is square.") : ("It is not square.");
    System.out.println(result);
    sc.close();
    }
}

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
//  System.out.println("x is less than or equal to y"); // statement2.








// A college has following rules for grading system:
// a. grade -A+      print ("Excellent !")
// b. grade -A        print ("Outstanding !")
// c. grade -B+      print ("Good !")
// d. grade -B        print ("Can do better !")
// e. grade -C+      print ("Just Passed !")
// f.  grade -C         print ("You Failed !")
//                              print ("Invalid grade!") for default case
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




}