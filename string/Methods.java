package string;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));//it will change into character array
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));


    }
}
