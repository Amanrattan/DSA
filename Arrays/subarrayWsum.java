package Arrays;

public class subarrayWsum {
    public static void main(String[] args)
    {
        subarrayWsum arraysum = new subarrayWsum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int s = 23;
        arraysum.subarraySum(arr, n, s);
    }



    private void subarraySum(int[] arr, int n, int s)
    {

        // Your code here
        for(int i = 0 ;i< n;i++){
            int currentsum = arr[i];
            if(currentsum == s){
                System.out.println("found at index"+ i);
                return;
            }
            else{
                for(int j = i+1;j < n;j++){
                    currentsum += arr[j];

                    if(currentsum == s){
                        System.out.println("sum found btw indexes" + i +"and"+ j);
                        return;
                    }
                }

            }

        }
        System.out.println(("not found"));
        return;
    }
}
