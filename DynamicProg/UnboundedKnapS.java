package DynamicProg;

import java.util.Scanner;

public class UnboundedKnapS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] vals = new int[n];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = scn.nextInt();
        }

        int[] wts = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[] dp = new int[cap + 1];
        dp[0] = 0;

        for (int bagc = 1; bagc <= cap; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {


                if(wts[i] <= bagc){   //bagc = capcity
                    int rbagc = bagc - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + vals[i];

                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }

        System.out.println(dp[cap]);
    }
}
//input
//5
//15 14 10 45 30
//2 5 1 3 4
//7
