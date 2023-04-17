

import java.util.Arrays;
import java.util.List;

public class asListExample {
    public static <T> List<T> convertArrayToList(T array[])

    {

        List<T> list = Arrays.asList(array);

        return list;

    }

    public static void main(String args[])

    {

        String array[]

                = { "Mangoes", "Oranges", "berries" };

        System.out.println("Array: "

                + Arrays.toString(array));

        List<String> list = convertArrayToList(array);

        System.out.println("List: " + list);

    }

}