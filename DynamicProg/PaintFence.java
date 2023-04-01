package DynamicProg;

import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();//number of house
        int k = scn.nextInt();//no. of colors

        long same = k * 1;
        long diff = k * (k - 1);
        long total = same + diff;

        for (int i = 3; i <= n ; i++) {
            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }
        System.out.println(total);
    }
}
//input
//8
//3
