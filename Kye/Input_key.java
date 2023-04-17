package Kye;
/*
3. User, Looser, Coder and Proger.

1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из вышеуказанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Input_key {
    public static class Work {
        public static void analize_person(ArrayList<String> items){
            String name_person;
            Person person = null;
            for (int i = 0; i<items.size() ; i++){
                name_person = items.get(i);    System.out.print("You - " + name_person+"!))) ");
                switch (name_person) {
                    case "user": person = new Person.User();
                        break;
                    case "loser": person = new Person.Loser();
                        break;
                    case "coder": person = new Person.Coder();
                        break;
                    case "proger": person = new Person.Proger();
                        break;
                }
                doWork(person);
            }
        }
    }
    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User)person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser)person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder)person).writeCode();
        else ((Person.Proger)person).enjoy();
    }

    public static void main(String[]arq) throws IOException {
        try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<String> list_key = new ArrayList<>();
            for (int i = 0; i<4; i++) {
                String a = read.readLine();
                if(!a.equals("proger") && !a.equals("coder") && !a.equals("user") && !a.equals("loser")) {
                    System.out.println("Введен не верный пользователь!");
                    break;
                } else {
                    list_key.add(a);
                }
            }
            System.out.println("Введены ключи: " + list_key);
            Work.analize_person(list_key);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
