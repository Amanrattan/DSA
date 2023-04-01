package DynamicProg;

import java.util.Scanner;

public class CountBinaryString {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        // 2 simple array
//        int[] dp0 = new int[n + 1]; ///dpz-dpzeroes
//        int[] dp1 = new int[n + 1]; ///dpz-dpones
//
//        dp0[0] = 0;
//        dp1[1] = 1;
//
//        for (int i = 2; i <= n ; i++) {
//            dp1[i] = dp1[i - 1] + dp0[i - 1];
//            dp0[i] = dp1[i - 1];
//        }
//        System.out.println(dp1[n] + dp0[n]);
//    }

    //simple takes 2 variable
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oczeros = 1;
        int ocones = 1;



        for (int i = 2; i <= n ; i++) {
            int nczeros = ocones;
            int ncones = oczeros + ocones;

            ocones = ncones;
            oczeros = nczeros;
        }
        System.out.println(oczeros + ocones);
    }
}
