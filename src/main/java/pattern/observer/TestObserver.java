package pattern.observer;

import java.util.ArrayList;

/**
 * Created by jackz on Feb 1:43 PM, 2019
 * The Observer Pattern defines a one-two-many between objects when one object changes state, all its
 * dependents are notified and updated automatically. The Observer Pattern describes these dependencies.
 * The key objects in this pattern are subject and observer. A subject may have any number of dependent
 * observers. All observers are notified whenever the subject undergoes a change in its state. In response,
 * each observer will query the subject to synchronize its state with the subject state.
 **/
public class TestObserver {

    public static void main(String[] args){
        Subject subject = new CommentaryObject(new ArrayList<Observer>(),"Soccer Match[2014AUG24]") ;
        Observer observer1 = new SMSUser(subject, "Adam Warner [New York]");
        observer1.subscribe();
        System.out.println();
        Observer observer2 = new SMSUser(subject, "Tim Ronney[London]");
        observer2.subscribe();

        //Important, convert subject to a Commentary interface to call the setDecs function
        Commentary cObject = (Commentary)subject;
        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");

        System.out.println();
        cObject.setDesc("It's a goal!");
        cObject.setDesc("Current score 1-0");
        System.out.println();

        Observer observer3 = new SMSUser(subject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();

        cObject.setDesc("It's another goal!");
        cObject.setDesc("Half-time score 2-0");
    }
}


