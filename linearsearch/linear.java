package linearsearch;

public class linear {
    public static void main(String[] args) {
        int[] nums = {23, 45, 3, 1, 4, 7, -3, 16, 11, 28};
        int target = 4;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static boolean linearSearch3(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return ststement above have execute
        //hence the target not found
        return false;
    }

    static int linearSearch2(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return ststement above have execute
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }

            //this line will execute if none of the return ststement above have execute
            //hence the target not found
        }
            return -1;
    }
}
