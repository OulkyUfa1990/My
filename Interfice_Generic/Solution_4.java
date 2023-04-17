package Interfice_Generic;
/*
7. Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/
public class Solution_4 {
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }
    public static void main(String[] args) {
        SimpleObject<String> simpleObject = new StringObject();
    }
}

