package Factory_hen;
public class HenFactory {
    static Hen getHen(String country){
        Hen hen = null;
        if (country.equals(Factory.Country.BELARUS)) {hen = new BelarusHen();}
        if (country.equals(Factory.Country.MOLDOVA)) {hen =new MoldjvaHen();}
        if (country.equals(Factory.Country.RUSSIA)) {hen = new RussianHen();}
        if (country.equals(Factory.Country.UKRAINE)) {hen = new UkraineHen();}
        return hen;
    }
}
