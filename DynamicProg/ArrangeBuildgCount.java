package DynamicProg;

import java.util.Scanner;

//same as COunt Binary String
public class ArrangeBuildgCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();

        long ob = 1;//oldbuilding
        long os = 1;//old space



        for (int i = 2; i <= n ; i++) {
            long nb = os;
            long ns = os + ob;

            os = ns;
            ob = nb;
        }
        long total = os + ob;
        total = total * total;

        System.out.println(total);
    }
}

