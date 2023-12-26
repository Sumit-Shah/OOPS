class Triangle {
    int a;
    int b;
    int c;


    //methods
    int getArea(){
        int area = 1/2*(a * b *c);
        return area;

    }


}
public class Task3 {
    public static void main(String[] args) {
        Triangle side = new Triangle();
        side.a = 3;
        side.b = 4;
        side.c = 5;

        int result = side.getArea();
        System.out.println("Area : " + result);

    }
    
}
