package Observer;

public class MatchSummery implements Observer{
    @Override
    public void notify(MatchState matchState) {
        System.out.println("Overs : "+matchState.overs);
    }
}
