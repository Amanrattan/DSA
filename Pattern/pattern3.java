package Pattern;

public class pattern3 {
    public static void main(String[] args) {
           pattern3(5);
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= n-row+1; col++) {//C=N +1-row;
                //if we start form 0 then the formaula change to C =N- row
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
