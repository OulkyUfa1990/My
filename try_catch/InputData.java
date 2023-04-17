package try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class InputData {
    static void readData(){
        int ID = 0;
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int line;
            while (ID == 0){
            list.add(line= Integer.parseInt(reader.readLine()));
            }
        } catch(IOException e){
        } catch (NumberFormatException e){
            System.out.println("Введенный символ не является числом");
            e.printStackTrace();
            System.out.println(list);
            ID++;
        }
    }
    public static void main(String[]arq){
        readData();
    }
}
