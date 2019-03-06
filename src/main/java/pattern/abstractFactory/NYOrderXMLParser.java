package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:45 PM, 2019
 **/
public class NYOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }
}
