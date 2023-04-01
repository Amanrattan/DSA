package methodd;

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = number.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }

    }
}
