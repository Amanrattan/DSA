package methodd;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner number=new Scanner(System.in);
        System.out.println("enter the number:");
        int a = number.nextInt();

//        int prime = prime(a);
//        System.out.println(prime);
        if(prime(a)){
            System.out.println(a + " is a prime number.");
        }
        else{
            System.out.println(a + " is not a prime number.");
        }
    }

//    private static boolean prime(int a) {
//        //corner case
//        if ( a <=1 ) {
//            System.out.println("not prime");
//        } else {
//            //check from 2 to n-1;
//            for (int i = 2; i < a; i++) {
//                if (a % i == 0) {
//                    System.out.println("prime");
//                } else
//                    System.out.println("not prime");
//            }
//            return a;
//        }
//        return a;
//    }
       private static boolean prime(int a) {
        if(a <= 1){
            return false;
        }
        for(int i=2;i<a;i++){
            if( a % i==0){
                return false;
            }
        }
        return true;
       }
}
