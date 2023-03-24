package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // List of Observers
    List<Observer> observerList = new ArrayList<>();

    // Subscribe
    public void subscribe(Observer observer){
        observerList.add(observer);
    }
    //UnSubscribe
    public void unSubscribe(Observer observer){
        observerList.remove(observer);
    }

    //Send Updates
    public void sendUpdates(String update){
        for ( Observer observer : observerList) {
//            observer.notify();
        }
    }
}
