package DynamicProg;

import java.util.Scanner;

public class ClimbStairJump {
    public static void main(String[] args) throws  Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n - 1;i >= 0;i--){// direction is <----
            for (int j = 1; j <= arr[i] && i+j < dp.length  ; j++) {
                 dp[i] += dp[i + j];
            }
        }
        System.out.println(dp[0]);
    }
}
//input
//13
//5
//5
//2
//4
//1
//5
//9
//8
//6
//3
//8
//9
//1