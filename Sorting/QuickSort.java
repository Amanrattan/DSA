package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
      int[] arr={5,4,3,2,1};
//      sort(arr,0,arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
    }
    static void sort(int[] nums,int low,int hi){
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e-s) / 2;
        int pivot = nums[m];
        while(s<=e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            //if voilated
            //also a reson if its already sorted it will not swap
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index.plzz sort two hlves
        sort(nums, low,e);
        sort(nums, s,hi);
    }
}
