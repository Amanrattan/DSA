package methodd;

import java.util.Scanner;
public class factorial {
 //Factorial Program using loop in java
//    public static void main(String[] args) {
//
//        Scanner  number = new Scanner(System.in);
//        System.out.println("enter the number:");
//        int a=number.nextInt();
//        int fact=1;
//
//        for (int i = 1; i <=a; i++) {
//            fact=fact*i;
//        }
//        System.out.println("factorial of"+a+" is:"+fact);
//    }
 //Factorial Program using recursion in java.
    public static void main(String[] args) {
     int i,fact=1;
        Scanner  number = new Scanner(System.in);
        System.out.println("enter the number:");
        int a=number.nextInt();

        fact=factorial(a);
        System.out.println("factorial of "+a+" is:"+fact);
    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
}
