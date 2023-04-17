package Factory_hen;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Factory.Country.RUSSIA+ ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}