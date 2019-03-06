package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:58 PM, 2019
 **/
public class TWOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML...");
        return "TW Order XML Message";
    }
}
