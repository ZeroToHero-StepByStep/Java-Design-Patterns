package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:41 PM, 2019
 **/
public interface AbstractParserFactory {

     public XMLParser getParserInstance(String parserType);
}
