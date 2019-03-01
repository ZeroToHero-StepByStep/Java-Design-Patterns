package pattern.factory;

/**
 * Created by Jack on Mar 9:58 PM, 2019
 **/
public class FeedbackXML implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing feedback XML ...");
        return "Feedback XML Message";
    }
}
