package Pattern;

public class pattern28 {
    public static void main(String[] args) {
           pattern28(5);
    }

    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            //for every row,run the col
            int totalColsInRow= row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
