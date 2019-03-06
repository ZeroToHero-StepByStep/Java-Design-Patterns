package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:50 PM, 2019
 **/
public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML...");
        return "TW Response XML Message";
    }
}
