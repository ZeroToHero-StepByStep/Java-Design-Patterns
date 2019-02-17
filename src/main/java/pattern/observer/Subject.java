package pattern.observer;

/**
 * Created by jackz on Feb 1:20 PM, 2019
 **/
public interface Subject {

    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();
}


