package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:46 PM, 2019
 **/
public class NYResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }
}
