package pattern.factory;

/**
 * Created by Jack on Mar 10:01 PM, 2019
 **/
public class ResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing response XML .. ");
        return "Response XML Message";
    }
}
