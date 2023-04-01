package DynamicProg;

import java.util.Scanner;

public class BestStock_v {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int mpist = 0;
        int leastsf = arr[0];
        int[] dpmpisut =  new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < leastsf){
                leastsf = arr[i];
            }

            mpist = arr[i] - leastsf;
            if(mpist > dpmpisut[i - 1]){
                dpmpisut[i] = mpist;
            }else{
                dpmpisut[i] = dpmpisut[i-1];
            }
        }
        //dpmpisut = dp left
        //opposite side
        int mpibt = 0;
        int maxat = arr[arr.length - 1];
        int[] dpr = new int[arr.length];

        for (int i = arr.length -2; i >= 0 ; i--) {

            if(arr[i] > maxat){
                maxat = arr[i];
            }
            mpibt = maxat - arr[i];
            if(mpibt > dpr[i + 1]){

                dpr[i] = mpibt;
            }else{
                dpr[i] = dpr[i+1];
            }
        }
        
        int op = 0;
        for (int i = 0; i < arr.length; i++) {
            if(dpmpisut[i] + dpr[i] > op){
                op = dpmpisut[i] + dpr[i];
            }
        }
        System.out.println(op);
    }
}

//input
//3
//10
//20
//30
