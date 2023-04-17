package Interfice_Generic;
/*Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть). Добавь эти интерфейсы классам Dog(собака),
Car(автомобиль), Duck(утка), Airplane(самолет).*/
public class two_Fly {
    public interface Fly{}
    public interface Move{}
    public interface Eat{}
    public class Dog implements Move, Eat{}
    public class Car implements Move{}
    public class Duck implements Fly, Move, Eat{}
    public class Airplane implements Fly{}
}
