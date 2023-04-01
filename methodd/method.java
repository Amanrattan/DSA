package methodd;

import java.util. Scanner;
public class method {

    public static void main(String[] args) {
       // sum();

       // int ans= sum2();
       // System.out.println(ans);

         int ans=sum3(20,30);
         System.out.println(ans);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
//        System.out.println("The sum = " + sum);
        return sum;
    }
    //pas the value of numbers when you are calling the methodd.method in main()
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
//    return_type name (arguments) {
//        //body
//        return statement;
//    }
}
