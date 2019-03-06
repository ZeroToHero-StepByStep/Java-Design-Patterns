package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:48 PM, 2019
 **/
public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing error XML...");
        return "TW Error XML Message";
    }
}
