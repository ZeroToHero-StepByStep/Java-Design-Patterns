package pattern.factory;

/**
 * Created by Jack on Mar 10:13 PM, 2019
 **/
public class ResponseXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
