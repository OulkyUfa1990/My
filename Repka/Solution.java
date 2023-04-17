package Repka;

import java.util.ArrayList;
import java.util.List;

/*
Репка
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();


        plot.add(new Person("Дедка", "Репку"));
        plot.add(new Person("Бабка", "Дедку"));
        plot.add(new Person("Внучка", "Бабку"));
        plot.add(new Person("Жучка", "Внучку"));

        RepkaStory.tell(plot);
    }
}