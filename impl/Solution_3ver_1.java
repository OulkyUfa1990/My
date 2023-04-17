package impl;
/*
1. Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуйте все нереализованные методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/
public class Solution_3ver_1 {
    public static class Beer implements GoDrink, GoDead{
        @Override
        public void Drink(){
            System.out.println("Im Drink");
        }
        public boolean isReadyToGoHome(){
            return READY_TO_GO_HOME;
        }
        @Override
        public void ImDead(){
            System.out.println("Im Dead");
        }
    }
    public interface GoDrink{
        void Drink();
    }
    public interface GoDead{
        void ImDead();
        boolean READY_TO_GO_HOME = false;
    }

    public static void main(String[]arq){
        Beer MyBeer = new Beer();
        MyBeer.Drink();
        System.out.println("Ты готов идти домой? Ответ: " + MyBeer.isReadyToGoHome());
    }
}
