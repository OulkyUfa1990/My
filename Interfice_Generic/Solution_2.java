package Interfice_Generic;
/*
8. Интерфейсы к классу Human
Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
Добавлять методы в класс Human запрещается.
*/
public class Solution_2 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }
    public static interface Worker extends Businessman, Secretary, Miner{
        @Override
        public void workLazy();
        @Override
        public default void workVeryHard(){
        }
        @Override
        public void workHard();
    }
    public static interface Businessman {
        public void workHard();
    }
    public static interface Secretary {
        public void workLazy();
    }
    public static interface Miner {
        public void workVeryHard();
    }
    public static class Human implements Worker {
        public void workHard() {
        }
        public void workLazy() {
        }
    }
}
