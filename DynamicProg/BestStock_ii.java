package DynamicProg;

import java.util.Scanner;

//Best Time to Buy and Sell Stocks - 2 (Infinite Transactions)
public class BestStock_ii {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        //array
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }

        int bd = 0;//buying date
        int sd = 0;//selling date
        int profit = 0;

        for (int i = 1; i <  prices.length; i++) {
            if(prices[i] >= prices[i - 1]){
                sd++;
            }
            else{
                profit += prices[sd] - prices[bd];
                bd = sd = i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
    }
}
//input
//3
//1
//2
//3
