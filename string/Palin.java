package string;

public class Palin {
    public static void main(String[] args) {
        String str="m";
        System.out.println(isPaindrome(str));
    }
    static boolean isPaindrome(String str){
        if (str == null || str.length() == 0) {
            return true;
        }


        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {//length is method or funvtion
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }

        }
        return true;
    }
}
