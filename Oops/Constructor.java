package Oops;

//1. No-argument constructor
//class geek{
//    int num;
//    String name;
//
//    geek(){
//        System.out.println("Constructor called");
//
//    }
//        }
//public class Constructor {
//    public static void main(String[] args) {
//        geek obj1 = new geek();
//
//        System.out.println(obj1.name);
//        System.out.println(obj1.num);
//    }
//}

//2. Parameterized Constructor

class Geek{

    String name;
    int id;

    Geek(String name,int id){
        this.name = name;
        this.id = id;
    }
}
class Constructor{
    public static void main(String[] args) {
        Geek obj2 = new Geek("adam",1);
        System.out.println("Geekname :" +obj2.name
                              + " and Geekid :" + obj2.id);

    }
}
