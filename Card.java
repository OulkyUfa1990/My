import java.util.*;

public class Card {
    String name, des;
    static int ID = 0;

    Card(String n, String d) {      //Конструктор класса
        name = n;
        des = d;
        ID++;                       //id - Счетчик карточек
    }

    class PublicCard {              //Внутренний класс, поэтому метод статический
        static void CreatCard() {
            System.out.println("Система ввода карточек!");
            //System.out.println("Введите данные карточки по следующему типа:\n 1.Название карточки \n 2.Описание карточки");

            int LenCard = 2;
            ArrayList<ArrayList<String>> Card = new ArrayList<>(LenCard);

            for(int i=0; i < LenCard; i++) {
                Card.add(new ArrayList<String>());
            }

            String m = "Да";
            while (m.equals("Да")){
                Scanner scan_n = new Scanner(System.in);
                Scanner scan_d = new Scanner(System.in);

                Card.get(0).add("Название карточки: " + scan_n.nextLine());
                Card.get(1).add("Описане карточки: " + scan_d.nextLine());

                System.out.println("Вы желаете внести запись в карточку?");
                Scanner question_welcome = new Scanner(System.in);
                m = question_welcome.nextLine();

            }

            /*int Lin_Line = Card.size();
            for (int i = 0; i < Lin_Line; i++) {
                int edgeCount = Card.get(i).size();
                for (int j = 0; j < edgeCount; j++) {
                    String Pos_element = Card.get(i).get(j);
                    System.out.println(Pos_element);
                }
            }   */

            int Lin_Line_2 = Card.size();
            for (int i = 0; i < Lin_Line_2; i++) {
                    String Pos_element_2 = String.valueOf(Card.get(i));
                    System.out.println(Pos_element_2);
            }

            System.out.println(Card);

        }
    }

    public static void main(String[] arqs) {

        PublicCard.CreatCard();
        System.out.println('\n' + "Программа завершена. Спасибо!");

    }
}