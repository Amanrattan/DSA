package Conditionals_and_loops;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //find the largest of 3 number
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c>max){
//            max=c;
//        }

        //2 method
//        int max= 0;
//        if(a > b){
//            max = b;
//        }
//        else{
//            max = b;
//        }
//        if(c> max){
//            max = c;
//        }
//        System.out.println(max);

        //3method
        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);

    }
}
