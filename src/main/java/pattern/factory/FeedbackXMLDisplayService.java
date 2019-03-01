package pattern.factory;

/**
 * Created by Jack on Mar 10:11 PM, 2019
 **/
public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new FeedbackXML();
    }
}
