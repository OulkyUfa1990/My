package Extends.polymorphism;

public class Get {
    static String name = "Valera";
    static public String getName(){
        return name;
    }
    public static void main(String[]arq){
        String Cowname = Get.getName();
        System.out.println(Cowname);
    }
}
