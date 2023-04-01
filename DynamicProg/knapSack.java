package DynamicProg;
import java.util.Arrays;
import java.util.Scanner;

public class knapSack {

//    public static void main(String args[]) {
//            int w = 10;
//            int n = 4;
//            int[] val = {10, 40, 30, 50};
//            int[] wt = {5, 4, 6, 3};
//
//            int[][] mat = new int[n + 1][w + 1];
//            // Populate base cases
//            for (int r = 0; r < w + 1; r++) {
//                mat[0][r] = 0;
//            }
//            for (int c = 0; c < n + 1; c++) {
//                mat[c][0] = 0;
//            }
//
//            // Main logic
//            for (int item = 1; item <= n; item++) {
//                for (int capacity = 1; capacity <= w; capacity++) {
//                    int maxValWithoutCurr = mat[item - 1][capacity]; // This is guaranteed to exist
//                    int maxValWithCurr = 0; // We initialize this value to 0
//
//                    int weightOfCurr = wt[item - 1]; // We use item -1 to account for the extra row at the top
//                    if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
//                        maxValWithCurr = val[item - 1]; // If so, maxValWithCurr is at least the value of the current item
//
//                        int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
//                        maxValWithCurr += mat[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
//                    }
//
//                    mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
//                }
//            }
//
//            System.out.println(mat[n][w]); // Final answer
//            System.out.println(Arrays.deepToString(mat)); // Visualization of the table
//        }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < vals.length; i++) {
            vals[i] = scn.nextInt();
        }

        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1 ; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                //j balls
                //i team score max
                dp[i][j] = dp[i - 1][j];//when i doesnt bat
                if(j >= wts[i - 1]) {
                    int rCap = j - wts[i - 1];//remaining capacity

                    //dp[i - 1][rCap] bakki team run
                    //vals[i - 1] es k khud k run
                    //dp[i - 1][j]  bating nhi krta
                    if (dp[i - 1][rCap] + vals[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][rCap] + vals[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];//when i doesn't bat
                    }
                }
                //balls kum hai
                     else{
                        dp[i][j] = dp[i - 1][j];//when i doesn't bat
                    }

            }
        }
        System.out.println(dp[n][cap]);
    }
}

