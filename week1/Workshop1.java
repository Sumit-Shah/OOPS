import java.util.Scanner;
public class Workshop1 {
    // //1
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in); {
    //         System.out.print("Enter the first line to print :");
    //         String a =  sc.nextLine();
    //         System.out.print("Enter a Second line to print : ");
    //         String b = sc.nextLine();

    //         System.out.println(a);
    //         System.out.println(b);  
    //         sc.close();

    //     }
    // }




    // // 2.
    // public static void main(String [] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the first number : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter the Second number : ");
    //     int b = sc.nextInt();

    //     int diff = a - b;
    //     System.out.println("The diff : " + diff);

    //     int pro = a * b;
    //     System.out.println("The prod : " + pro);
    // }



    // //3.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("int :");
    //     int a = sc.nextInt();
    //     System.out.print("double :");
    //     double b = sc.nextDouble();
    //     System.out.print("Enter char : ");
    //     String c = sc.nextLine();


    //     System.out.println(a);
    //     System.out.println(b);
    //     System.out.println(c);
    // }




    // //4.Are tringle
    // public static void main (String[] arg) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Side 1  : ");
    //     double a = sc.nextDouble();
    //     System.out.print("side 2  : ");
    //     double b = sc.nextDouble();
    //     System.out.print("side 3  : ");
    //     double c = sc.nextDouble();

    //     double s = (a + b + c)/2;


    //     System.out.println("Area : " + a);

    // }





    // //5
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Length : ");
    //     double l = sc.nextDouble();
    //     double a = Math.pow(l,2);

    //     System.out.println("Area : " + a);
    // }
    




    // //6.
    // public static void main(String [] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Temperature(Celsius) : ");
    //     double c = sc.nextDouble();

    //     double f = (c * (9/5) + 32);
    //     System.out.println("Temperature(Fahrenheit) : " + f );
    // }






    //7
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Radius : ");
    //     double r = sc.nextDouble();
    //     System.out.print("height : ");
    //     double h = sc.nextDouble();

    //     double a = (Math.PI * Math.pow(r,2) * h);

    //     System.out.println("Volume : " + a);
    // }





    // //8.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Principle : ");
    //     double p = sc.nextDouble();
    //     System.out.print("Time : ");
    //     double t = sc.nextDouble();
    //     System.out.print("Rate : ");
    //     double r = sc.nextDouble();

    //     double s = (p * t * r)/100;

    //     System.out.println("SimpleIntrest : " + s);
    // }






    // //9
    // public static void main(String [] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("a : ");
    //     double a = sc.nextDouble();
    //     System.out.print("b : ");
    //     double b = sc.nextDouble();
    //     System.out.print("c : ");
    //     double c = sc.nextDouble();

    //     double add = a + b + c;
    //     double sub = a - b - c;
    //     double mul = a * b * c;
    //     double div = a / b / c;

    //     System.out.println("Addition : " + add);
    //     System.out.println("Subbtraction : " + sub);
    //     System.out.println("Multiplication : " + mul);
    //     System.out.println("Division : " + div);
    // }





    // //10.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Length : ");
    //     double l = sc.nextDouble();
    //     System.out.print("Width : ");
    //     double w = sc.nextDouble();

    //     double p = (2 * (l + w));

    //     System.out.println("Perimeter : " + p);
    // }



    // //11.
    // public static void main(String [] arg) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Distance (Mile) : ");
    //     double m = sc.nextDouble();
        
    //     double k = m *  1.609344;

    //     System.out.println("Distance : " + k + "Killometer");

    // }




    // // 12.
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter  Radius : ");
    //     double r = sc.nextDouble();

    //     double a = Math.PI * Math.pow(r,2);

    //     System.out.println("Area of Circle : " + a);
    // }





    // // // 13.
    // public static void main(String [] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Quantity : ");
    //     double q = sc.nextDouble();
    //     System.out.print("Price : ");
    //     double p = sc.nextDouble();

    //     double  t = q * p;

    //     System.out.println("Total cost : " + p);
    // }




    // 14.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dollor amount : ");
        double a = sc.nextDouble();
        System.out.print("Enter the rate : ");  
        double r = sc.nextDouble();
        
        double m = a * r;

        System.out.println("Amount of money  : " + m);
    }

}
