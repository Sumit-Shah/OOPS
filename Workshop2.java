import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Workshop2{
    public static void main(String[] args) {
        // System.out.println("Hellow world");
        //         Object Oriented Design and Programming                                              

        // Workshop2

        //         Go through the questions below and answer the questions:

        // Taking length and breadth of a rectangle from user and check if it is square or not.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the length. : ");
        // int l = sc.nextInt();
        // System.out.print("Enter the breath. : ");
        // int b = sc.nextInt();
        // String result = (l == b) ? ("SQUARE") : ("NOT SQUARE.");
        // System.out.println(result);
        // sc.close();




        // A college has following rules for grading system:
        // a. 40 to 50 - C
        // b. 50 to 60 - C+
        // c. 60 to 70 - B
        // d. 70 to 80 - B+
        // e. 80 to 90 - A
        // f. Above 90 - A+
        // Ask user to enter marks and print the corresponding grade using if-else-if statement.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the marks : ");
        // int marks = sc.nextInt();

        // if (marks >= 40 && marks < 50) {
        //     System.out.println("C");
        // } else if (marks >= 50 && marks < 60) {
        //     System.out.println("C+");
        // } else if (marks >= 60 &&  marks < 70) {
        //     System.out.println("B");
        // } else if (marks >= 70 &&  marks < 80) {
        //     System.out.println("B+");
        // } else if (marks >= 80 &&  marks < 90) {
        //     System.out.println("A");
        // } else if (marks >= 90 &&  marks <= 100) {
        //     System.out.println("A+");
        // } else {
        //     System.out.println("INVALID MARKS.");
        // }
        // sc.close();


        




        

        // Determine oldest and youngest among the people taking the using input.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the age of first person.");
        // int a = sc.nextInt();
        // System.out.print("Enter the age of Second person.");
        // int b = sc.nextInt();
        // String result = (a > b) ? ("First person is Oldest and Second is youngest") : ("Scond is oldest and first is youngest.");
        // System.out.println(result);
        // sc.close();







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
        // int x = 2;
        // int y = 5;
        // int z = 0;
        // System.out.println(x == 2);
        // System.out.println(x != 5);
        // System.out.println(x != 5 && y >= 5);
        // System.out.println(z != 0 || x == 2);
        // System.out.println(!(y < 10));



        // Ask student if he/she has medical cause or not ( 'y or 'n' ). if (‘y’) print you are not allowed to sit in the exam  and if(‘n’’) print you can sit in the exam.
        // Scanner sc = new Scanner(System.in);
        // System.out.print(" If you have medical cause or not ( 'y or 'n' ) : ");
        // char c = sc.next().charAt(0);
        // String result = (c == 'y') ? ("You are not allowed to sit in exam. ") : ("You are allowed to sit in exam.");
        // System.out.println(result);
        // sc.close();







        // Write a program to check the odd and even numbers using user input.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        // String result = (n % 2 == 0) ? ("EVEN NUMBER.") : ("ODD NUMBER. ");
        // System.out.println(result);
        // sc.close();






        // Write a program to print the value of x ,if and only if the value of x is x>5 and less x<15 taking user input.
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the number. (x>5 and less x<15): ");
            // int x = sc.nextInt();
            // int r = (x>5 && x<15) ? (x) : (0);
            // System.out.println(r);
            // sc.close();


        // Assuming the value: x=20,y=15,z=10.Complete the code below and observe the result. 
        // if (x > y) 
        // {
        //     if (y > z){  System.out.println("x is greater than y and z");}    // statement1.
        // }
        // else
        // System.out.println("x is less than or equal to y"); // statement2.

        // int x=20;
        // int y=15;
        // int z=10;
        // if (x > y) {
        //     if (y > z){  System.out.println("x is greater than y and z");}    
        // }
        // else
        // System.out.println("x is less than or equal to y"); 









        // A college has following rules for grading system:
        // a. grade -A+      print ("Excellent !")
        // b. grade -A        print ("Outstanding !")
        // c. grade -B+      print ("Good !")
        // d. grade -B        print ("Can do better !")
        // e. grade -C+      print ("Just Passed !")
        // f.  grade -C         print ("You Failed !")
        //                             print ("Invalid grade!") for default case
        // Ask user to enter grade  and print the corresponding grade using switch statement

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your Grade : ");
        // String input = sc.nextLine();
        // switch (input) {
        //     case "A+":
        //         System.out.println("Excellent!");
        //         break;
        //     case "A":
        //         System.out.println("Can do better!");
        //         break;
        //     case "B+":
        //         System.out.println("You Failed!");
        //         break;
        //     case "B":  
        //         System.out.println("Outstanding!");
        //         break;
        //     case "C+": 
        //         System.out.println("Good!");
        //         break;
        //     case "C":  
        //         System.out.println("Just Passed!");
        //         break;
        //     default:
        //         System.out.println("Invalid grade!");
        // }
        // sc.close();

        




        // Run the code below and observe how the break statement works.
        // class Student {
            // public static void main(String[] args) {
                // int roll_no = 12;    
                // switch (5) {
                //     case 1:
                //         System.out.println("Your roll number is 10");
                //         break;
                //     case 2:
                //         System.out.println("Your roll number is 12");
                //         break;
                //     default:
                //         System.out.println("Your roll number is greater than 12");
                // }
            // }
        // }




        // Write a program to take two string user input and perform the following string methods and observe the result
        // length()
        // compareTo()
        // charAt()
        // substring()
        // Equals
        // toUpperCase()
        // toLowerCase()
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First String : ");
        // String a = sc.nextLine();
        // System.out.print("Enter Second String : ");
        // String b = sc.nextLine();

        // // length()
        // System.out.println("length() of First String: " + a.length());
        // System.out.println("length() of Second String: " + b.length());

        // // charAt()
        // System.out.println("charAt() a : " + a.charAt(2) );

        // // substring()
        // System.out.println("substring() a : "+ a.substring(2, 4));
        
        // // Equals
        // System.out.println("Equals : " + a.equals(b));
        // System.out.println("Equals : " + b.equals(a));
        

        // // toUpperCase()
        // // toLowerCase()
        // System.out.println("toUpperCase() : " + a.toUpperCase());
        // System.out.println("toLowerCase() : " + b.toLowerCase());
        // sc.close();


        






    
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Herald collage");
        // }









        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int num = sc.nextInt();
        // int sum = 0;

        // for (int i = 0; i<=num; i++){

        //     if(i%2 ==0){
        //         sum +=i;
        //     }
            
        // }

        // System.out.println("sum:" + sum);
        // sc.close();




        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //             for (int line = 1; line <= n; line++) {
        //         for (int star = 1; star <= n - line + 1; star++) {
        //             System.out.print("*");
        //         }
        //         System.out.println(); 
        //     }
        




        // System.out.print("Enter the number of Stars and line : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int line=1; line<=n; line++) {
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }



            //   System.out.print("Enter the number of Stars and line : ");
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // int line = 1;

            // while (line <= n) {
            //     int star = 1;
            //     while (star <= line) {
            //         System.out.print("*");
            //         star++;
            //     }
            //     System.out.println();
            //     line++;
            // }
        







        //   Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int num = sc.nextInt();
        // int sum = 0;

        // for (int i = 0; i<=num; i++){

        //     if(i%2 ==0){
        //         sum +=i;
        //     }
            
        // }

        // System.out.println("sum:" + sum);
        // sc.close();




            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            //         for (int line = 1; line <= n; line++) {
            //     for (int star = 1; star <= n - line + 1; star++) {
            //         System.out.print("*");
            //     }
            //     System.out.println(); 
            // }
        




        //  System.out.print("Enter the number line : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int line=1; line<=n; line++) {
        //     for(int l=1; l<=n; l++){
        //         System.out.print("l");
        //     }
        //     System.out.println();

        // }
        // sc.close();



        //8.
        // int numbers [] ={1, 2, 3, 4, 5};
        // int numbers [] [] ={{1,2,3}, {4,5,6}, {7, 8,9}};
        // for (int i =0; i<numbers.length; i++){
        //     for (int j = 0; j < numbers[i].length; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     } System.out.println(" ");
        // for (int i : numbers) {
        // }





        // / int numbers [] ={1, 2, 3, 4, 5};
        // int numbers [] [] ={{1,2,3}, {4,5,6}, {7, 8,9}};
        // scan sc = new Scanner(system.in);
        // int key = sc.nextInt(0);
        // for (int i =0; i<numbers.length; i++){
        //     for (int j = 0; j < numbers[i].length; j++){
        //         System.out.print(numbers[i][j] + " ");
        //         int index = linerSearch(numbers, key);
        //         if(index == -1){
        //             System.out.println("Not FOund");
        //         } else {
        //             System.out.println("Key is found at index " + index);
        //         }
        //     } System.out.println(" ");

        // }



        
        








        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int line=1; line<=n; line++) {
        //     for(int number=1; number<=line; number++) {
        //         System.out.print(number + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();






        // 5.	Develop a Java program that declares and initializes an array of integers. 
        // Print the elements of the array in reverse order.
    
            // int [] array = new int [] {1, 2, 3, 4, 5};
            // System.out.print("Original array : ");
            // for (int i=0; i<array.length; i++) {
            //     System.out.print(array[i] + " ");
            // }
            // System.out.println();
            // System.out.print("Array in reverse order : ");
            // for(int i=array.length-1; i>=0; i--) {
            //     System.out.print(array[i]+" ");
            // }












            // 8.	Create a Java program that sorts an array of integers 
            // in ascending order using the bubble sort algorithm.

            

    }
}