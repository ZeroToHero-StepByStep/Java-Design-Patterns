package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:44 PM, 2019
 **/
public class NYFeedbackXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }
}
