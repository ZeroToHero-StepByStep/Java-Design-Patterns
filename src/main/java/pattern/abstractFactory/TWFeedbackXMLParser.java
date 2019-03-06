package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:49 PM, 2019
 **/
public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }
}
