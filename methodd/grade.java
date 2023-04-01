package methodd;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;

        average = totalMarks/count;
        /* Printing grade of a student using switch case statement */
        System.out.print("The student Grade is: ");
        if(average >= 80){
            System.out.println("A");
        }
        else if(average>=60 && average<80)
        {
            System.out.print("B");
        }
        else if(average>=40 && average<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
