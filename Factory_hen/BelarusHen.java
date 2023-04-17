package Factory_hen;

public class BelarusHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth(){
        return 4;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Factory.Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
