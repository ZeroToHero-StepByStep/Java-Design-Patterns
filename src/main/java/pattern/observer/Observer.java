package pattern.observer;

/**
 * Created by jackz on Feb 1:22 PM, 2019
 **/
public interface Observer {

    void update(String desc);
    void subscribe();
    void unSubscribe();
}
