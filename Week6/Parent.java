// abstract class Bank{
//     int amount;

//     abstract int getBalance();

//     Bank(int amount){
//         this.amount = amount;
//     }
// }

// class BankA extends Bank{

//     BankA(int amount){
//         super(amount);
//     }

//     @Override
//     int getBalance() {
//         return amount;
//     }
// }

// class BankB extends Bank{

//     BankB(int amount){
//         super(amount);
//     }

//     @Override
//     int getBalance() {
//         return amount;
//     }
// }

// class BankC extends Bank{

//     BankC(int amount){
//         super(amount);
//     }

//     @Override
//     int getBalance() {
//         return amount;
//     }
// }






// public class Main{
//     public static void main(String[] args) {
//         BankA banka = new BankA(1500);
//         BankA bankb = new BankA(1600);
//         BankA bankc = new BankA(1700);
//         System.out.println("Amount in bank a is " + banka.getBalance());
//         System.out.println("Amount in bank b is " + bankb.getBalance());
//         System.out.println("Amount in bank c is " + bankc.getBalance());
//     }
// }









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
