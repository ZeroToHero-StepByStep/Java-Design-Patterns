package pattern.factory;

/**
 * Created by Jack on Mar 10:14 PM, 2019
 *
 * The Factory Method Pattern gives us a way to encapsulation the instantiations of concrete types. The Factory
 * Method pattern encapsulates the functionality required to select and instantiate an appropriate class, inside
 * a designated method referred to as a factory method. The factory method selects an appropriate class hierarchy
 * based on the application context and other influencing factors. It then instantiates the selected class and
 * return it as an instance of the parent class type.
 *
 * The advantage of this approach is that the application objects can make use of factory method to get to the
 * appropriate class instance. This eliminates the need for an application object to deal with the varying class
 * selection criteria. 
 **/
public class TestFactoryMethodPattern {

    public static void main(String []args){
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();
    }
}
