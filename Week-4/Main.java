// class Car {
//     // attributes
//     String publication;
//     String authorName;
//     int price;

//     // methods
//     void getDescription() {
//         System.out.println("Description of the Car;");
//     }

// }

// // Driver class
// public class Main {
//     public static void main(String[] args) {
//         Car car1 = new Car();
//         car1.authorName = "Sam";
//         car1.price = 2000;
//         car1.publication = "ABC publication";

//         car1.getDescription();
//     }
// }















class Average {

    int num1;
    int num2;
    int num3;

    //methiods
    int getAverage(){
        int average = (num1 + num2 +num3)/3;
        return average;

    }
}

public class Main{
    public static void main(String[]args){
        Average numbers = new Average();
        numbers.num1 = 10;
        numbers.num2 = 20;
        numbers.num3 = 30;

        int result = numbers.getAverage();
        System.out.println("Average: " + result);
    }
}