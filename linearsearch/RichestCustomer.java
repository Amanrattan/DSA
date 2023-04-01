package linearsearch;

public class RichestCustomer {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int ans = Integer.MIN_VALUE;
        //inhance for (int person = 0; person < accounts.length; person++)
        for (int[] ints : accounts) {
            //when you start a new col.take a new sum for that row
            int sum = 0;
            //inhance -->for (int account = 0; account < ints.length; account++)
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we have sum of acounts of person
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
