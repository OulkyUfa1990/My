package Singl;


/**
 * Created by promoscow on 14.08.16.
 */
public class Singleton
{
    private static Singleton i;
    public static Singleton getInstance()
    {
        if(i==null)
            i=new Singleton();
        return i;
    }
    private Singleton(){} //Скрыли стандартный конструктор, что бы объект можно было создать только с помощью нашего метода getInstance()
}