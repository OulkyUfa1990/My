package Interfice_Generic;
/*
8. Жив или нет
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presidentable.
5. Унаследуй интерфейс Presidentable от интерфейса Person.
 */
public class Solution_5 {
    interface Person<T>{
        String isAlive();
    }
    public interface Presidentable extends Person{}
    public static class Man<T> implements Person{
        @Override
        public String isAlive(){
            return "Жив";
        }
    }
    public static void main(String[] arq){
        Person<String> Man_1 = new Man<>();
        System.out.println(Man_1.isAlive());
    }
}
