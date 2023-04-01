package DynamicProg;

import java.util.Scanner;

//Best Time to Buy and Sell Stocks - One Transaction Allowed
public class BestStock_i {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }

        int lsf = Integer.MAX_VALUE; //lsf --> leastsofar
        int op = 0; //op-- > overall profit
        int pist = 0;// pist -> profit if sold today

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < lsf){
                lsf = prices[i];
            }

            pist = prices[i] - lsf;
            if (pist > op) {

                op = pist;
            }
        }
        System.out.println(op);
     }
}
//input
//3
//1
//2
//3
