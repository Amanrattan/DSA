package methodd;

import java.util.Scanner;

//Java Program to calculate area and circumference of circle
public class circle {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("enter the radius:");
//      int r = number.nextInt();
        double r = number.nextDouble();

       double area =area(r);
        System.out.println(area);

        double circumference = circumference(r);
        System.out.println(circumference);
    }

    private static double circumference(double r) {
        double b;
        b=Math.PI * 2 * r;
        System.out.println("circumference is:");
        return b;
    }

    static double area(double r) {
        double a;
//        a = 3.14 * r * r;
        a = Math.PI * r * r;
        System.out.println("area is:");
        return a;
    }

}
