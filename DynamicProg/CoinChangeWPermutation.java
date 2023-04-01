package DynamicProg;

import java.util.Scanner;

public class CoinChangeWPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] coins = new int[n];
        //innthis array we r collecting domination of coins
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        int[] dp = new int[tar + 1];
        dp[0] = 1;

        for (int amount = 1; amount < dp.length; amount++) {
            for (int coin: coins) {//it means it take one by one all the coins
                  if(coin <= amount){
                      int ramt = amount - coin;//rmat reaming amount
                      dp[amount] += dp[ramt];
                  }
            }
        }
        System.out.println(dp[tar]);
    }
}
//input
//4
//2
//3
//5
//6
//10
