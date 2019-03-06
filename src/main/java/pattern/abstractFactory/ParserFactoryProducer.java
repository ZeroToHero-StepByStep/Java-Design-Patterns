package pattern.abstractFactory;

/**
 * Created by Jack on Mar 9:51 PM, 2019
 **/
public final class ParserFactoryProducer {

    private ParserFactoryProducer(){
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType){
        switch (factoryType){
            case "NYFactory": return new NYParserFactory();
            case "TWFactory": return new TWParserFactory();
        }
        return null;
    }
}
