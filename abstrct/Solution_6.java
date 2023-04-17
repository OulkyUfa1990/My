package abstrct;

public class Solution_6 {
    public static abstract class Translator{
        abstract String getLanguage();
        String translate(){
            return "Я переводчик " + getLanguage();
        }
    }
    public static class EnglishTranslator extends Translator {
        public String getLanguage(){
            return "с английского";
        }
    }
    public static void main(String[]arq){
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }
}
