package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class array_min_max {
    static int[] MyArray = new int[10];
    static void Reader(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            for (int i = 0; i < MyArray.length; i++){
                MyArray[i] = Integer.parseInt(reader.readLine());
            }
        } catch (NumberFormatException e){
            System.out.println("Введенный символ не является числом");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Отказ операции или ее прерывание");
            e.printStackTrace();
        }
    }
    static void Min(){
        int min = MyArray[0];
        for (int i = 0; i < MyArray.length; i++){
            if (MyArray[i] < min){
                min = MyArray[i];
            }
        }
        System.out.println("Минимальное число массива - " + min);
    }
    static void Max(){
        int max = MyArray[0];
        for (int i = 0; i < MyArray.length; i++){
            if (MyArray[i] > max){
                max = MyArray[i];
            }
        }
        System.out.println("Максимальное число массива - " + max);
    }
    public static void main(String[]arq){
        Reader(); Min(); Max();
    }
}
