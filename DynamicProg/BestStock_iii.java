package DynamicProg;

import java.util.Scanner;

//Best Time to Buy and Sell Stocks with Transaction Fee and Infinite Transactions
public class BestStock_iii {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        //array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int obsp = -arr[0]; //old buy state profit
        int ossp = 0;      //old sold state profit

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;//new buy state profit
            int nssp = 0;

            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }else{
                nbsp = obsp;
            }

            if(obsp + arr[i] - fee > ossp){
                nssp = obsp + arr[i] - fee;
            }else{
                nssp = ossp;
            }

            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}

//input
//3
//10
//20
//30
//2

