package pattern.factory;

/**
 * Created by Jack on Mar 10:12 PM, 2019
 **/
public class OrderXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
