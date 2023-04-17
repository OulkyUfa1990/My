/*2. НОД.

Задача: Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        if (firstNumber <= 0 || secondNumber <= 0) throw new NumberFormatException();
        int nod = 0;
        int dividingNumber = 0;
        if (firstNumber > secondNumber) dividingNumber = firstNumber;
        else if (secondNumber > firstNumber) dividingNumber = secondNumber;
        else dividingNumber = firstNumber;
        for (int i = dividingNumber; i > 1; i--) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                nod = i;
                break;
            }
        }
        System.out.println(nod);

    }
}
