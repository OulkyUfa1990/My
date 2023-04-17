package StackTrace;

public class StackTrace_five_met {
    static void out_stack(){
        int ID=0; //Счетчик методов в стеке
        StackTraceElement[] MyStacks = Thread.currentThread().getStackTrace(); //Вывод стэка данного метода
        for (StackTraceElement element : MyStacks){
            System.out.print("Стек - " + element.getMethodName() + '\n');
            ID++;
        }
        System.out.println ("Глубина стека - " + ID);
    }

    public static void main(String[]arq){
        method1();
        System.out.println("Метод main");
        out_stack();
    }
    public static void method1(){
        method2();
        System.out.println("Метод 1");
        out_stack();
    }
    public static void method2(){
        System.out.println("Метод 2");
        out_stack();
    }
}
