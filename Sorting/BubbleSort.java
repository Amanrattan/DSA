package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={-1,79,3,-16,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for eachsteps, amx itmes will come st the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //<= -i -1
                //swap if the items is smaller than the previous item
                if(arr[j] < arr[j-1]){
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }
            //if you did not swap for a particular value of i,it means the array is sorted hence stop the program
            if(!swapped ){//!false = true
                break;
            }
        }
    }
}
