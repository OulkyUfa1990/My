package Factory_hen;

public class UkraineHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth(){
        return 2;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Factory.Country.UKRAINE+ ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
