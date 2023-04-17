package Interfice_Generic;
//Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись «Я - кот».
//Ход решения!
//Мы не реализовывали метод getName а взяли его как абстактный. Далее мы его переоределили.
// Т.к. в main нельзя вызвать нестатический метод, то мы создаем объект класса нового метода и вызываем переопределенный метод.
public class getCat_Abstrct {
    public abstract static class One{
        public abstract String getName();
    }
    public static class Cat extends One {
        @Override
        public String getName() {
            return "Я - кот";
        }
    }
    public static void main(String[] arq) {
        Cat my_cat=new Cat();
        System.out.println(my_cat.getName());
    }
}
