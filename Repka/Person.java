package Repka;

public class Person implements RepkaItem {
    public void pull(Person person) {
        System.out.println(this.name + " за " + person.namePadezh);
    }
    private String name;
    private String namePadezh;
    public Person(String name, String namePadezh) { //Конструктор формирования массива List
        this.name = name;
        this.namePadezh = namePadezh;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNamePadezh() {
        return namePadezh;
    }
    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
}

