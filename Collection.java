import java.util.*;
public class Collection {
    public static void main(String[] args) {

        List<Integer> Ildar=new ArrayList<Integer>();
        Ildar.add(1);
        Ildar.add(2);
        for (Integer element : Ildar){
        System.out.println(element);}

        Ildar.add(0, 12);
        Ildar.add(1, 113);
        System.out.println(Ildar);

    }
}