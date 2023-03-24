package Observer;

public class ScoreCard implements Observer{
    @Override
    public void notify(MatchState matchState) {
        System.out.println("Score : "+matchState.score);
    }
}
