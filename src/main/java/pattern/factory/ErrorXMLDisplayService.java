package pattern.factory;

/**
 * Created by Jack on Mar 10:05 PM, 2019
 **/
public class ErrorXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
