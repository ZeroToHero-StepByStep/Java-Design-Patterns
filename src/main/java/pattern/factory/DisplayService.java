package pattern.factory;

/**
 * Created by Jack on Mar 10:03 PM, 2019
 **/
public abstract class DisplayService {

    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
