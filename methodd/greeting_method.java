package methodd;

public class greeting_method {
    public static void main(String[] args) {
//        String message= greet();
//        System.out.println(message);

        String personalised = myGreet("aman");
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message ="hello " + name;
        return message;
    }

    static String greet () {
        String greeting ="how r u!";
        return greeting;
        }
    }



