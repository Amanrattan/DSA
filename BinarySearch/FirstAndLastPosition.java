package BinarySearch;
//34. Find First and Last Position of Element in Sorted Array
public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums,int target) {

        int[] ans = {-1, -1};

        //check for first occurence if target first
//        int start = search(nums, target, true);
//        int end = search(nums, target, false);

        ans[0] = search(nums, target, true);
        if (ans[0] != 1) {
            ans[1] = search(nums, target, false);
        }
        return ans;


//        ans[0] = start;
//        ans[1] = end;
//        return ans;
    }

    int search(int[] nums,int target,boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;//-1 because of index start from 0

        while (start <= end) {
            //find the middle element
            //       int mid = (start + end )/2;//inetrger has a fixed size,might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;//new formula

            if (target < nums[mid]) {
                //lies on left side,start will not change
                end = mid - 1;
            } else if (target > nums[mid]) {
                //lies on right side,end will not change
                start = mid + 1;
            } else {
//                potential ans found
                ans = mid;
                if(findStartIndex ){//== true
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
