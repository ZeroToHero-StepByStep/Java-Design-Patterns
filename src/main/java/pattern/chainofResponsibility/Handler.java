package pattern.chainofResponsibility;


/**
 * Created by Jack on Feb 6:55 PM, 2019
 **/
public interface Handler {

    void setHandler(Handler handler);
    void process(File file);
    public String getHandlerName();

}
