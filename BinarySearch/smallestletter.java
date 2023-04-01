package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallestletter {

        public static void main(String[] args) {

        }
    public char nextGreatestLetter(char[] arr/*letters*/, char target) {

        int start=0;
        int end= arr.length -1;//-1 because of index start from 0

        while(start <= end){
            //find the middle element
            //       int mid = (start + end )/2;//inetrger has a fixed size,might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end -start) /2;//new formula

            if(target < arr[mid]){
                //lies on left side,start will not change
                end = mid - 1;
            }else {
                //lies on right side,end will not change
                start = mid + 1;
            }
        }
        //nothing will excuted this wil exceute.
        return arr[start % arr.length];
        //it return whats on index is.
    }

}

