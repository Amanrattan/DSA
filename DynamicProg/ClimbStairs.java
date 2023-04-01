package DynamicProg;

import java.util.Scanner;
//there is 3 types of jump 1,2,3
public class ClimbStairs {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int cp = countPaths(n);
//        int cp = countPaths(n,new int[n + 1]);
        int cp = countPathsTab(n);
        System.out.println(cp);
    }

    public static int countPaths(int n){
        if(n == 0) {
            return 1;
        }else if(n < 0){
            return 0;
        }

        System.out.println("hello" + n);
        int nm1 = countPaths(n - 1);
        int nm2 = countPaths(n - 2);
        int nm3 = countPaths(n - 3);

        int cp = nm1 + nm2 + nm3;

        return cp;
    }
    //dp->memozitation
    public static int countPaths(int n,int[] qb){
        if(n == 0) {
            return 1;
        }else if(n < 0){
            return 0;
        }

        if(qb[n] > 0){
            return qb[n];
        }

        System.out.println("hello" + n);
        int nm1 = countPaths(n - 1, qb);
        int nm2 = countPaths(n - 2, qb);
        int nm3 = countPaths(n - 3, qb);

        int cp = nm1 + nm2 + nm3;

        qb[n] = cp;
        return cp;
    }

    //tabulation
    public static int countPathsTab(int n) {
        int[] dp = new int[n + 1];
        
        //through iteration
        dp[0] = 1;
        for (int i = 1; i <= n ; i++) {
            //exception:
            if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
               dp[i] = dp[i - 1]/*2-1=1 return 1*/ + dp[i - 2]/*2-2=0 return 0*/;
            }else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
    return dp[n];
    }
}
