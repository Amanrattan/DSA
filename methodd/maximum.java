package methodd;
//Write a Program to find the Maximum and Minimum of the Given Three Numbers


import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {


    Scanner number = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int first = number.nextInt();

        System.out.println("please enter second number:");
        int second = number.nextInt();

        System.out.println("please enter third number:");
        int third = number.nextInt();

        int largest = largest(first,second,third);
        int smallest = smallest(first,second,third);
        System.out.println("largest of three numbers "+first+","+second+","+third+"is :"+largest);
        System.out.println("smallest of three numbers "+first+","+second+","+third+"is :"+smallest);
}
    public static int largest(int first,int second,int third){
    int max= first;
    if(second >max){
        max=second;
    }
    if(third>max){
        max=third;
    }
    return max;
    }
    private static int smallest(int first, int second, int third) {
        int min= first;
        if(second <min){
            min=second;
        }
        if(third<min){
            min=third;
        }
        return min;
    }




}
