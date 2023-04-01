package Pattern;

public class pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            //for every row,run the col
            int totalColsInRow= row > n ? 2 * n - row : row;

//            remove -1 or col startt from 0
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
