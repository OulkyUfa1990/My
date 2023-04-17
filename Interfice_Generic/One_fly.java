package Interfice_Generic;
//Напиши свой public интерфейс Fly (летать). Добавь в него два метода.
//Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать). Добавить в каждый интерфейс по одному методу.
public class One_fly {
    public interface Fly{
        void makeFly();
        String name();
    }
    public interface Run{
        void makeRun();
    }
    public interface Swim{
        void fastSwim();
    }
}
