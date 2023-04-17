package abstrct;
/*
3. Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 */
import java.io.*;
public class Solution_7 {
    public static void main(String[]arq) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fname = reader.readLine();
        InputStream inStream = new FileInputStream(fname);

        while (inStream.available()>0){
            System.out.println(inStream.read() + "  - " + (char)inStream.read());
        }
        inStream.close();
        reader.close();
    }
}
