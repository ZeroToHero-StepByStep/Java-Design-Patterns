package pattern.factory;

/**
 * Created by Jack on Mar 10:00 PM, 2019
 **/
public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {

        System.out.println("Parsing order XML ... ");
        return "Order XML Message";
    }
}
