package Observer;

public class MainController {
    public static void run() throws Exception{
        //creating Subject
        Subject subject = new Subject();

        //Creating Observers
        Observer battingCard = new BattingCard();
        Observer ballingCard = new ScoreCard();
        Observer summery = new MatchSummery();

        //Subscribe the Subject
        subject.subscribe(battingCard);
        subject.subscribe(ballingCard);
        subject.subscribe(summery);

        MatchState matchState = new MatchState();
        matchState.overs = 0.0;
        matchState.marks = 0;
        matchState.wickets = 0;
        matchState.baller = "Baller";
        matchState.batting1 = "Kumesh";
        matchState.batting2 = "Dilini";
        matchState.score = 0;
        // Updating
        battingCard.notify(matchState);
        ballingCard.notify(matchState);
        summery.notify(matchState);

        Thread.sleep(1000);

        matchState.overs = 0.1;
        matchState.marks = 0;
        matchState.wickets = 0;
        matchState.baller = "Baller";
        matchState.batting1 = "Kumesh";
        matchState.batting2 = "Dilini";
        matchState.score = 0;

        Thread.sleep(3000);

        matchState.overs = 0.2;
        matchState.marks = 1;
        matchState.wickets = 0;
        matchState.baller = "Baller";
        matchState.batting1 = "Kumesh";
        matchState.batting2 = "Dilini";
        matchState.score = 1;

        nitifySubscribers(subject);
    }

    public static void nitifySubscribers(Subject subject){
        subject.sendUpdates("BroadCast For All");
    }
}
