package pattern.factory;

/**
 * Created by Jack on Mar 9:57 PM, 2019
 **/
public class ErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing error XML ... ");
        return "Error XML Message";
    }
}
