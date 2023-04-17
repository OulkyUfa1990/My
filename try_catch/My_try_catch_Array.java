package try_catch;
public class My_try_catch_Array {
    public static void main (String[]arq){
        try{
            int[]m = new int[2];
            m[8] = 5;
            System.out.println("Конец блока try");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Шаг 2. Перехват ошибки, блок catch.Выход за пределы массива." + '\n' + "Ошибка типа ArrayIndexOutOfBoundsException");
        }
    System.out.println("Конец программы");
    }
}
