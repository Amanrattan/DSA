package linearsearch;
//Given an array nums of integers,
// return how many of them contain an even number of digits.
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896,62};
        //System.out.println(findNumbers(nums));

        //find the number of digits->in this only digit block will
        //work
        //System.out.println(digits(54763));
        //for negative
//        System.out.println(digits(-54763));
//        for zero
//        System.out.println(digits(0));

//        2 method
        System.out.println(digits2(-345678));
    }
    static int findNumbers(int[] nums){
        int count =0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
//function to check whether a number contains even digits.
    //1.count the no. of digits
    //2.convert 1764="176"
    //    take the length


    static boolean even(int num) {
        int numberOfDigits = digits(num);
       /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        //shortcut
        return numberOfDigits % 2 == 0;
    }
    //optimize
    static int digits2(int num){
        //shortcut
        if(num < 0){
            num = num * -1;
        }
        //optimize
        return (int)(Math.log10(num)) + 1;
    }
    //count number of digits in a number
    static int digits(int num){
        //-ve
        if(num < 0){
            num = num * -1;
        }
        //0(zero)
        if(num == 0){
            return 1;
        }
           int count =0;
           while(num > 0){
               count++;
               num = num / 10;
               //num /=10;
           }
        return count;
    }
}
