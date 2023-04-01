package methodd;

import java.util.Scanner;

public class tovote {

    public static void main(String[] args) {

        Scanner number= new Scanner(System.in) ;
        System.out.println("enter the age:");
        int age=number.nextInt();

        int adult = adult(age);
        System.out.println(adult);
    }

    private static int adult(int age) {
        if(age >=18){
            System.out.println("You r eligible for vote:");
        }
        else{
            System.out.println("You r not eligible for vote:");
        }
        return age;
    }
}
