// // Source code for Task3:
// abstract class Shape {
//     abstract int getSquareArea(int length);

//     abstract int getRectangleArea(int length, int breadth);

//     abstract double getCircleArea(int radius);

// }

// class Area extends Shape {
//     @Override
//     int getSquareArea(int length) {
//         return length * length;
//     }

//     @Override
//     int getRectangleArea(int length, int breadth) {
//         return length * breadth;
//     }

//     @Override
//     double getCircleArea(int radius) {
//         return Math.PI * radius * radius;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Area a1 = new Area();

//         System.out.println("Area of rectangle: " + a1.getRectangleArea(10, 5));
//         System.out.println("Area of square: " + a1.getSquareArea(10));
//         System.out.println("Area of radius: " + a1.getCircleArea(10));

//     }
// }












// 1.  Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
// Define the abstract class 'Parent'
// abstract class Parent {
//     abstract void message();
// }

// // Create the first subclass
// class FirstSubclass extends Parent {
//     void message() {
//         System.out.println("This is the first subclass");
//     }
// }

// // Create the second subclass
// class SecondSubclass extends Parent {
//     void message() {
//         System.out.println("This is the second subclass");
//     }
// }

// // Main class to test
// public class Main {
//     public static void main(String[] args) {
//         // Create objects for each subclass
//         FirstSubclass firstObj = new FirstSubclass();
//         SecondSubclass secondObj = new SecondSubclass();

//         // Call the 'message' method for each object
//         firstObj.message();
//         secondObj.message();
//     }
// }








// 2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
// abstract class Bank {
//     abstract int getBalance();
// }

// class BankA extends Bank {
//     private int balance = 100;

//     int getBalance() {
//         return balance;
//     }
// }

// class BankB extends Bank {
//     private int balance = 150;

//     int getBalance() {
//         return balance;
//     }
// }

// class BankC extends Bank {
//     private int balance = 200;

//     int getBalance() {
//         return balance;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankA bankA = new BankA();
//         BankB bankB = new BankB();
//         BankC bankC = new BankC();

//         System.out.println("Balance in Bank A: $" + bankA.getBalance());
//         System.out.println("Balance in Bank B: $" + bankB.getBalance());
//         System.out.println("Balance in Bank C: $" + bankC.getBalance());
//     }
// }


// public class Main{
//     public static void main(String[] args) {
//         System.out.println("Preceding");
//         try {
//             System.out.println(10/0);
//         }
        
//     }
// }




// import java.util.regex.Pattern;

// public class Main {
//     public static void main(String[] args) {

//         boolean isMatchFound = Pattern.matches("[a-zA-Z][a-zA-Z0-9]*\\.(txt|py|json|csv)$", "aasdas1.java");
//         System.out.println(isMatchFound);
//     }
// }












// Task 4
// Implement an interface Employee with methods printEmployeeId() and printSalary(). 
// Use it in classes Manager and Developer.



// Task 5

// Create an interface named Shape with a method calculateArea(). 
// Implement this interface in two classes: Circle and Rectangle. 
// The Circle class should have a constructor that takes the radius as a parameter, and the Rectangle class should have a constructor that takes the length and width as parameters. Implement the abstract method from interface Shape in the classes, Rectangle and Circle.













interface PowerOnOff {
    void turnOn();
    void turnOff();
}

interface DeviceInfo {
    void displayInfo();
}

interface ElectronicDevice extends PowerOnOff, DeviceInfo {}

class Television implements ElectronicDevice {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("TV turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV turned off");
    }

    public void displayInfo() {
        System.out.println(" This is a TV");
    }
}

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        tv.displayInfo();
    }
}
