package Observer;

public class BattingCard implements Observer{
    @Override
    public void notify(MatchState matchState) {
        System.out.println("Batting 01 : "+matchState.batting1);
        System.out.println("Batting 02 : "+matchState.batting2);
    }
}
