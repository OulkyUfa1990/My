package abstrct;
/*1. Сортировка четных чисел из файла.
Задача:
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5 8 11 3 2 10
Пример вывода:
2 8 10
папка - MyDocument: докуенты - Input, Output.
*/
import java.io.BufferedReader; import java.io.FileReader; import java.io.IOException; import java.io.InputStreamReader;
import java.util.ArrayList; import java.util.Collections; import java.util.List;
public class Solution_9_Input {
    public static void main(String[]arq) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fRead = new FileReader(reader.readLine());
        BufferedReader secondReader = new BufferedReader(fRead)){
            List<Integer> list = new ArrayList<>();
            String line;
            while ((line = secondReader.readLine()) !=null) {
                int x = Integer.parseInt(line);
                if ((x % 2) == 0) {
                    list.add(x);
                }
            }
            Collections.sort(list);
            for (int x : list) {
                System.out.println(x);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
