package pattern.flyweight;

/**
 * Created by Jack on Feb 5:24 PM, 2019
 **/
public class CPlatform implements Platform {

    public CPlatform(){
        System.out.println("CPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Comping and executing C code.");
    }
}
