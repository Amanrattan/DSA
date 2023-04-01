package DynamicProg;
//Best Time to Buy and Sell Stocks with Cool down - Infinite Transactions
import java.util.Scanner;

public class BestStock_iv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        //array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0; //old cool state profit

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }else{
                nbsp = obsp;
            }

            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }else{
                nssp = ossp;
            }

            if(ossp > ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
//input
//3
//10
//20
//30
