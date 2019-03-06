package pattern.abstractFactory;

/**
 * Created by Jack on Mar 10:01 PM, 2019
 *
 * The Abstract Factory is a design pattern which provides an interface for creating families of related or
 * dependent objects without specifying their concrete classes. The Abstract Factory Pattern takes the concept
 * of the Factory Pattern to the nex level. An abstract factory is a class that provides an interface to produce
 * a family of objects. In Java, it can be implemented using an interface or an abstract class.
 *
 * The Abstract Factory pattern is useful when a client wants to create an instance of one of a suite of related,
 * dependent classes without having to know which specific concrete class is to be instantiated. Different concrete
 * factories implements the abstract factory interface. Client objects make use of these factories to objects and,
 * therefore, do not need to know which concrete class is actually instantiated.
 *
 * Use the Abstract Factory pattern when
 *
 * • A system should be independent of how its products are created, composed, and represented.
 * • A system should be configured with one of multiple families of products.
 * • A family of related product objects is designed to be used together,and you need to enforce this constraint.
 * • You want to provide a class library of products, and you want to reveal just their interface, not their implementation
 **/
public class TestAbstractFactoryPattern{

    public static void main(String []args){
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg = parser.parse();
        System.out.println(msg);

        System.out.println("****************************");
        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);

    }
}
