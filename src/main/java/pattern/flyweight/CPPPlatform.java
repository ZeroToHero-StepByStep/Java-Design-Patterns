package pattern.flyweight;

/**
 * Created by Jack on Feb 5:26 PM, 2019
 **/
public class CPPPlatform implements Platform{

    public CPPPlatform(){
        System.out.println("CPPPlatform object created.");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Comping and executing CPP code.");
    }
}
