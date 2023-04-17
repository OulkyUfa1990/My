package abstrct;
/*4. Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.*/
import java.io.*;

public class Input_Solution_8 {
    public static void main(String[]arq) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fname = reader.readLine();
        reader.close();

        InputStream inStream = new FileInputStream(fname);
        OutputStream outStream = new FileOutputStream("file.txt");

        while (inStream.available() > 0){
            int data = inStream.read();
            outStream.write(data);
        }
        inStream.close();
        outStream.close();
    }
}
