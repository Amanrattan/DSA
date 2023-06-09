package DynamicProg;

import java.util.Scanner;

public class MinCostPath {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        //original array
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        //dp array
        int[][] dp = new int[n][m];
        //solve from down to up wads thats why  i-- & j--
        for (int i = dp.length - 1; i >=0 ; i--) {
            for (int j = dp[0].length - 1; j >= 0 ; j--) {
                 //divide four sides
                if(i == dp.length - 1 && j == dp[0].length - 1){
                     dp[i][j] = arr[i][j];
                }else if(i == dp.length - 1){
                     dp[i][j] = dp[i][j + 1] + arr[i][j];//imp
                }else if(j == dp[0].length - 1){
                     dp[i][j] = dp[i + 1][j] + arr[i][j];
                }else{
                     dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
//input
//2
//2
//3
//1
//4
//3
