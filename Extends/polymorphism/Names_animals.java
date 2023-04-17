package Extends.polymorphism;

public class Names_animals {

    public class Cow{
        public static void getName(){
            System.out.println("I'm Cow");
        }
    }
    public class Whale extends Cow{
        public static void getName(){
            System.out.println("I'm not Cow? I'm Whale");
        }
    }
    public static void main(String[]arq){
        Whale.getName();
    }
}
