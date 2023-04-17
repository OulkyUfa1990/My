package try_catch;

public class try_catch_null {
    static void LowCase(){
        String s = null, m;
        if (s == null){
            throw new NullPointerException ("Введено значение null. Ошибка NullPointerException");
        }
        System.out.println(m = s.toLowerCase() + " - Ошибок не было");
    }
    public static void main(String[] arq){
        try {
            LowCase();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Финальный блок обработчика ошибок");
        }
        System.out.println("Завершен метод main");
    }
}

