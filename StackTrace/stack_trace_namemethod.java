
package StackTrace;

public class stack_trace_namemethod {
    public static void main(String[]arq){
        method1();
        System.out.println("Метод main");
        try {
            StackTraceElement[] MyStacks = Thread.currentThread().getStackTrace(); //Присваивается путь всего стека
            StackTraceElement element = MyStacks[0];    //Присвоение элементу имени родительского метода
            System.out.println(element.getLineNumber());    //getLineNumber() Возвращает номер строки в файле, в которой был вызов метода
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка типа ArrayIndexOutOfBoundsException" + '\n' + "main родительский элемент");
        }
    }
    public static void method1(){
        method2();
        System.out.println("Метод 1");
        StackTraceElement[] MyStacks = Thread.currentThread().getStackTrace(); //Присваивается путь всего стека
        StackTraceElement element = MyStacks[2];
        System.out.println(element.getLineNumber());    //getLineNumber() Возвращает номер строки в файле, в которой был вызов метода
    }
    public static void method2(){
        System.out.println("Метод 2");
        StackTraceElement[] MyStacks = Thread.currentThread().getStackTrace(); //Присваивается путь всего стека
        StackTraceElement element = MyStacks[2];
        System.out.println(element.getMethodName());
    }
}
