package Interfice_Generic;

public class setCat_Absrct {
    public static void main(String[]arq){
        Cat MyCat = new Cat();
        MyCat.setName("Кролик");
        MyCat.setName("");
        System.out.println(MyCat.getName());
    }
    public abstract static class Cat_first{
        String name = "Котик";
        public abstract void setName(String name);
    }
    public static class Cat extends Cat_first{
        @Override
        public void setName(String name){
            //System.out.println(name);
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    }
}
