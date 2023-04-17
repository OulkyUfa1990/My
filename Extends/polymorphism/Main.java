package Extends.polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,6,4,2};

        // создаем экземпляр, чтоб вызывать нестатический метод
        Main main = new Main();
        System.out.println(main.minFromArray(numbers));
    }

    // наш нестатический метод:
    public Integer minFromArray(int[] numbers) {
        var min = Arrays.stream(numbers).min().getAsInt();
        return min;
    }
}