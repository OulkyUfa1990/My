//Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
package Extends.polymorphism;
public class getObjectType {
    static public class Cat{
    }
    static public class Dog{
    }
    static public class Bird{
    }
    static public class Pig{
    }
    public static void main(String[] arq){
        System.out.println(getObjectType(new Pig()));
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Bird()));
    }
    public static String getObjectType(Object o){
        if (o instanceof Cat) return "Кошка";
        else if (o instanceof Dog) return "Собака";
        else if (o instanceof Bird) return "Птичка";
        else return "Свинья";
    }
}
