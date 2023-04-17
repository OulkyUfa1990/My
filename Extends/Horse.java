package Extends;

public class Horse {
    static String name;
    static int height;
    class Pegas extends Horse{
        static void writed(){
            name = "Лошадь 1";
            height = 1000;
            System.out.println("Класс Пегас унаследован от Лошади" + name + height);
        }
    }
    public static void main(String[]arq){
        Pegas.writed();
    }
}
