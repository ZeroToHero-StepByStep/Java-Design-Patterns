package pattern.flyweight;

/**
 * Created by Jack on Feb 5:28 PM, 2019
 **/
public class RubyPlatform implements Platform {

    public RubyPlatform(){
        System.out.println("Rubyplatform object created.");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Comping and executing Ruby code.");
    }
}
