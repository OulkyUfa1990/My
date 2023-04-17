package Interfice_Generic;
/*Напиши public класс Human(человек) и public интерфейсы Run(бежать/ездить), Swim(плавать).
Добавь в каждый интерфейс по одному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.*/
public class Man {
    public abstract class Human implements Run, Swim {}
    public interface Run{
        void makeRun();
    }
    public interface Swim{
        void makeSem();
    }
    public static void main(String[]arq){
    }
}
