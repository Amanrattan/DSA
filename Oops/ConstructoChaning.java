package Oops;

public class ConstructoChaning {

    ConstructoChaning(){
        this(5);
        System.out.println("The default const");
    }

    ConstructoChaning(int x){

        this(5,15);
        System.out.println(x);
    }
    ConstructoChaning(int x,int y){
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        new ConstructoChaning();
    }
}
