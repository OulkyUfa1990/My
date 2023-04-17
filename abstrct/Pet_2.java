package abstrct;
/*Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.*/
public abstract class Pet_2 {
    abstract String getName();
    public static void main(String[]arq){
        class Cat extends Pet_2{
            @Override
            public String getName(){
                return "";
            }
        }
    }
}
