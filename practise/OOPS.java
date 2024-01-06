// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen(); //Created a pen Object
//         // p1.setColor("Blue");
//         // System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//         p1.setColor("black");
//         System.out.println(p1.color);


//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "SUmitShah";
//         // myAcc.Password = "abcdefg";
//         myAcc.setPassword("abcdefghi");
        
//     }
// }


// class BankAccount {
//     public String username;
//     private String Password;

//     public void setPassword(String pwd) {
//             Password = pwd;

//     }
// }

// class Pen {
//    String color;
//    int tip;
   
//    void setColor(String newColor) {
//     color = newColor;
//    }

//    void setTip(int newTip) {
//     tip = newTip;
//    }
// }

// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int math) {

//     }
// }








///Getter and Setter
// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen(); //Created a pen Object
//         // p1.setColor("Blue");
//         // System.out.println(p1.color);
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());

//         p1.setTip(5);
//         System.out.println(p1.getTip());
        
//         p1.setColor("black");
//         System.out.println(p1.getColor());

        
//     }
// }


// class BankAccount {
//     public String username;
//     private String Password;

//     public void setPassword(String pwd) {
//             Password = pwd;

//     }
// }

// class Pen {
//    private String color;
//    private int tip;


//    String getColor() {
//     return this.color;
//    }

//    int getTip() {
//     return this.tip;
//    }
   
//    void setColor(String newColor) {
//     this.color = newColor;
//    }

//    void setTip(int Tip) {
//     this.tip = Tip;
//    }
// }








//CONSTRUCTOR 

// import javax.sound.midi.Soundbank;

// public class OOPS {
//     public static void main(String[] args) {
//         // Student s1 = new Student("SUMIT");
//         // System.out.println(s1.name);


        // Student s1 = new Student();
        // Student s2 = new Student("Sumit");
        // Student s3 = new Student(1123);


//     }

// }

// class Student {
//     String name;
//     int roll;
// //Non paramiterized constructor 
//     Student(){
//     // Student(String name) {
//         // this.name = name;

//         System.out.println("Constructor is called.");
//     }


// //paramiterized constructor
//     Student(String name) {
//         this.name = name;
//     }
//     Student(int roll) {
//         this.roll = roll;
//     }

// }


//COPY CONSTRUCTOR
// import java.util.*;

public class OOPS {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sumit";
        s1.roll = 1233;
        s1.password = "abcde";

        s1.marks[0] = 100;
        s1.marks[1] = 96;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        // Copying marks array
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Default constructor
    Student() {
        marks = new int[3];
    }

    // Parameterized constructors...
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
