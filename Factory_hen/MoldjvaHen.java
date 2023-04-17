package Factory_hen;

public class MoldjvaHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth(){
        return 3;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Factory.Country.MOLDOVA+ ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
