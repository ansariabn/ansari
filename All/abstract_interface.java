package All;
/*
this is abstract method and understand the abstract method
 */

abstract class animal {
    public abstract void animalSound();
}
class Pig extends animal {
    public void animalSound(){
        System.out.println("the pig say: wee wee ");
    }
}

public class abstract_interface  {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();

    }
}


/*
interface method
 */
//interface animal {
//    public void animalSound();
//    public void sleep();

// public void barking(){                     /* this method is know as default method is in interface
//     System.out.println("Dog is barking");}
//}
//class Pig implements animal{
//    public void animalSound(){
//        System.out.println("the pig say : wee wee");
//    }
//    public void sleep(){
//        System.out.println("Zzz");
//    }
//}
//public class abstract_interface  {
//    public static void main(String[] args) {
//        Pig pig = new Pig();
//        pig.animalSound();
//        pig.sleep();
//
//    }
//}
