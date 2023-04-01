package DynamicProg;

import java.util.Scanner;

public class CoinChngComb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i < arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int amt = scn.nextInt();//amt --> amount

        int[] dp = new int[amt + 1];

        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {//full 2 then 3,5
            for (int j = arr[i]; j < dp.length; j++) {
              dp[j] += dp[j - arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
//input
//3
//2
//3
//5
//7

