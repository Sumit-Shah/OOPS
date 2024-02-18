// Task 1:
// Define a class Person with attributes name and age.
// Create a subclass Employee that inherits from Person and adds attributes employeeId, and salary.
// Initialize an object employee1 using class Employee. Assign values to the attributes name, age, employeeId, and salary.


// class Person {
//     String name;
//     int age;

//     void print(){
//         System.out.println("I  am in Class");
//     }
// }

// class Employee extends Person {
//     int employeeId;
//     int salary;
// }

// public class Main {

//     public static void main(String[] args) {
//         Employee employee1 = new Employee();
//         employee1.name = "JHON";
//         employee1.age = 25;
//         employee1.salary = 25000;
//         System.out.println(employee1.name);
//         System.out.println(employee1.age);
//         System.out.println(employee1.salary);

//     }
// }







// Add a method makeSound() to the class Animal defined in task 2.
// // Create subclasses Dog and Cat that inherit from Animal and override the makeSound() method to print the sound made by dog and cat respectively.

// class Animal {
//     String sound;
//     String 


//     void sound(){
//         System.out.println("Sound");
        
//     }
// }

// class Dog extends Animal {
// ass Cat extends Animal {
//     @Override
//     void sound(){
//         System.out.println("Mew Mew");
//     }
// }





//     @Override
//     void sound(){
//         System.out.println("Bau Bau");
//     }
    
// }

// cl















// Implement a class Shape with attributes color and method printArea().
// Create a subclass Rectangle that inherits from Shape and adds attributes length and width.
//  Use super() to initialize the color attribute in the Rectangle constructor.
// Create a subclass Square that inherits from Shape and adds attributes length. 
// Use super() to initialize the color attribute in the Square constructor.

// class Shape {
//     String color;

// }

// class Rectangle extends Shape {
//     int length;
//     int width;

//     Area();
// }

// class Square extends shape {

// }

// class Shape {
//     String color;

//     public Shape(String color) {
//         this.color = color;
//     }

//     public void printArea() {
//         System.out.println("calculate and print area.");
//     }
// }

// class Rectangle extends Shape {
//     int length;
//     int width;

//     public Rectangle(String color, int length, int width) {
//         super(color);
//         this.length = length;
//         this.width = width;
//     }

//     public void printArea() {
//         int area = length * width;
//         System.out.println("The area of the rectangle is: " + area);
//     }
// }

// class Square extends Shape {
//     int length;

//     public Square(String color, int length) {
//         super(color);
//         this.length = length;
//     }

//     public void printArea() {
//         int area = length * length;
//         System.out.println("The area of the square is: " + area);
//     }
// }









// Create a class AreaCalculator with method calculateArea() and perform the following tasks:
// Create an overloaded method named calculateArea to compute and display the area of a rectangle using length and width.
// Overload the calculateArea() method to calculate and display the area of a square using the side length.
// Overload the calculateArea method again to calculate and display the area of a triangle using base and height.

public class Main {
    public static void main(String args[]) {
    calculator calc = new calculator();
    System.out.println(calc.area(5.2, 5.5));
    }

    
}
class calculator {
    float area(float l, float w);{
        return l*w;
    }
    

}







