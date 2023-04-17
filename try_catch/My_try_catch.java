package try_catch;

import java.util.*;
public class My_try_catch {
    static void input(){
        int a,b,dev;
        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);

        a = Integer.parseInt(scan_a.nextLine());
        b = Integer.parseInt(scan_b.nextLine());

        if (b == 0) {
            throw new ArithmeticException("Введено значение 0");
        }
        dev=a/b;
        System.out.println(dev);
    }
    public static void main (String[] arq){
        try {
            input();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Исключение было обработано. Программа продолжается");
        }
        finally {
            System.out.println("Финальный блок обработчика ошибок");
        }
        System.out.println("Завершен метод main");
    }
}

