package methodd;

import java.util.Scanner;
//Java Program To Multiply Two Numbers Using The Method
public class product {

    public static void main(String[] args) {

        Scanner number=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = number.nextInt();

        System.out.println("enter the second number:");
        int b = number.nextInt();

        int multiple = multiple(a,b);
        System.out.println(multiple);
    }

    static int multiple(int a, int b) {
        int c=a*b;
        System.out.println("product of to numbers is:");
        return c;
    }
}
