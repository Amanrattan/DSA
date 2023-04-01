package BinarySearch;
//time complexity: O(logn)
//space complexity:
public class floor {
        public static void main(String[] args) {
            int[] arr={2,3,5,9,14,16,18};
            int target = 15;
            int ans= Floor(arr,target);
            System.out.println(ans);
        }
        //return the index


        static int Floor(int[] arr,int target){
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
            return end;
        }
}

