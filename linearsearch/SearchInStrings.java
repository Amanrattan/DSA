package linearsearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "aman";
        char target ='n';
       // System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    //2
    static boolean search2(String str,char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
            return false;
    }
   //1
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0;  i < str.length(); i++) {
            if(target == str.charAt(i)){
                //charAt for char at particular string
                return true;
            }
        }
        return false;
    }
}
