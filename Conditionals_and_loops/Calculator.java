package Conditionals_and_loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;

        while(true){
            //take operator as imput
            System.out.println("enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' ||op =='/' || op == '%'){
                //input two numbers
                System.out.println("Enter 2 numbers");
                int num1= in.nextInt();
                int num2= in.nextInt();

                if(op == '+'){
                    ans =num1 + num2;
                }
                if(op == '-'){
                    ans =num1 - num2;
                }
                if(op == '*'){
                    ans =num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans =num1 % num2;
                }

            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("invalid operation!!");
            }
            System.out.println(ans);
        }

    }
}
