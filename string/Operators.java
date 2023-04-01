package string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println(('a' + 3));
        System.out.println((char) ('a' + 3));
        //with strings it take string value

        System.out.println("a" + 1);//interger will be converted to
        //Intergre that will call toString()
        //thisis same as after a few steps: "a" + 1;

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

//        System.out.println(new Integer(56) + "" + new ArrayList<>());//just add string "" this will work
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');

    }
}