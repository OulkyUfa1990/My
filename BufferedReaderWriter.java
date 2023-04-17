import java.lang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderWriter {
    String Name_card, Des_card;
    static int ID = 0;

    BufferedReaderWriter(String name, String des) {      //Конструктор класса
        Name_card = name;
        Des_card = des;
        ID++;                       //id - Счетчик карточек
    }

    static class PublicCard_2 {              //Внутренний класс, поэтому метод статический
        static void Created_Card() {
            System.out.println("Система ввода карточек!");
            System.out.println("Введите данные карточки по следующему типа:\n 1.Название карточки \n 2.Описание карточки");
        }
    }
    public static void main(String[] args) {

        //PublicCard_2.Created_Card();

        //String outputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            try (BufferedWriter writToFile= new BufferedWriter(new FileWriter("D:\\notes5.txt"))){
                String line;
                while (!(line = reader.readLine()).equals("!")){
                    writToFile.write(line+"\n");
                    writToFile.flush();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}