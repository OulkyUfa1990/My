package redefinition;
public class Main_print {
    static int print (int a){
        return a;
    }
    static String print (String b){
        return b;
    }
    public static void main(String[]arq){
        System.out.println(print(3));
        System.out.println(print("Ildar"));
    }
}
