package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {5,12,4,1,9,34,22};
//        int[] ans = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));//it store sorted array but show the original array
//        original array is not modifiled

//        int[] arr = {5,12,4,1,9,34,22};
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//      it will give output & show the sort/change in original array
        //        original array is modifiled

        //inplace
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =  mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e - s == 1){
            return;
        }

        int mid = (s+e) / 2;

        mergeSortInPlace(arr, s , mid);
        mergeSortInPlace(arr, mid, e);

       mergeInPlace(arr, s, mid, e);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;//pointer
        int j  = 0;
        int k = 0;

        while(i < first.length && j < second.length ){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining elements
        while(i < first.length){
            mix[k] =first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    private static void mergeInPlace(int[] arr,int s,int m,int e) {
        int[] mix = new int[e - s];

        int i = s;//pointer
        int j  = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining elements
        while(i < m){
            mix[k] =arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
