package Interfice_Generic;
import java.lang.reflect.Method;
/*Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «хз».
Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
Класс Solution должен содержать метод String getObjectType(Object o).
Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
Метод getObjectType() должен возвращать строку "Корова", если передан объект типа Cow.
Метод getObjectType() должен возвращать строку "Животное", если передан объект типа Animal.
Программа должна выводить на экран результат метода getObjectType().
*/
public class animals_method{
        public static String getObjectType(Object o){
            String name = null;
            Class clazz = o.getClass();
            Method getClassName = null;
            try {
                getClassName = clazz.getDeclaredMethod("getClassName");
                name = (String) getClassName.invoke(o);
            }catch (Exception ignored){}
            return name;
        }
        public static class Cat extends Animal{
            public String getClassName(){
                return "Кот";
            }
        }
        public static class Tiger{
            public String getClassName(){
                return "Тигр";
            }
        }
        public static class Lion{}
        public static class Buw{}
        public static class Cow{}
        public static class Animal{
            public String getClassName(){
                return "Животное";
            }
        }
    public static void main(String[]arq){
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
    }
}
