package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:43 PM, 2019
 **/
public class NYErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing error XML... ");
        return "NY Error XML Message";
    }
}
