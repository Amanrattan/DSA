package BinarySearch;

public class ceiling {

        public static void main(String[] args) {
            int[] arr={2,3,5,9,14,16,18};
            int target = 15;
            int ans= Ceiling(arr,target);
            System.out.println(ans);
        }
        //return the index of smallest no >= target

        static int Ceiling(int[] arr,int target){

            //but what if the target is greater than the greatest number in the array
            //in that case no index
            if(target > arr[arr.length - 1]){
                return -1;
            }
            int start=0;
            int end= arr.length -1;//-1 because of index start from 0

            while(start <= end){
                //find the middle element
                //       int mid = (start + end )/2;//inetrger has a fixed size,might be possible that (start+end) exceeds the range of int in java
                int mid = start + (end -start) /2;//new formula

                if(target < arr[mid]){
                    //lies on left side,start will not change
                    end = mid - 1;
                }else if(target > arr[mid]){
                    //lies on right side,end will not change
                    start = mid + 1;
                }else{
                    //(target == mid)
                    //return ans mid
                    return mid;
                }
            }
            //nothing will excuted this wil exceute.
            return start;
        }
}

