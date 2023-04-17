package StackTrace;

public class divisionByZero {
    static void foo(){
        try{
            int s=1/0;
            System.out.println(s);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void main(String[]arq){
        foo();
    }
}
