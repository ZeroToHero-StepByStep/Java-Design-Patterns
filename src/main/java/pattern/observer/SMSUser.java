package pattern.observer;

/**
 * Created by jackz on Feb 1:37 PM, 2019
 **/
public class SMSUser implements Observer {

    private final Subject subject;
    private String desc;
    private String userInfo;

    public SMSUser(Subject subject, String userInfo){
        if(subject == null){
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    private void display(){
        System.out.println("[" + userInfo+"]" + desc);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() +" ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() +" ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully");
    }


}


