package try_catch;
import java.util.ArrayList;
public class Try_catch_List {
    public static void main(String[]arq){
        try{
            ArrayList<String> list=new ArrayList<String>();
            String s= list.get(8);
            System.out.println(s);
        } catch(IndexOutOfBoundsException e){
            System.out.println("Блок catch. Ошибка типа IndexOutOfBoundsException.");
        }
    System.out.println("Завершен метод main");
    }
}
