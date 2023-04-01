package BinarySearch;
//OrderAgnosticBS-sorted arr but dont know its in ascnding & desencding
public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        //descn order arr
        int[] arr={99,80,34,22,11,10,5,4,3,2,-3,-2};
        int target = 11;

        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start =0;
        int end= arr.length -1;//-1 because of index start from 0

        //find whether the array is sorted is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc =true;
//        }else{
//            isAsc = false;
//        }

        while(start <= end){
            //find the middle element
            //       int mid = (start + end )/2;//inetrger has a fixed size,might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end -start) /2;//new formula

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    //lies on left side,start will not change
                    end = mid - 1;
                }else {
                    //if(target > arr[mid])
                    //lies on right side,end will not change
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    //lies on left side,start will not change
                    end = mid - 1;
                }else{
                    // if(target < arr[mid])
                    //lies on right side,end will not change
                    start = mid + 1;
                }
            }
        }
        //nothing will excuted this wil exceute.
        return -1;

    }
}
