package pattern.flyweight;

/**
 * Created by Jack on Feb 5:12 PM, 2019
 **/
public class JavaPlatform implements Platform {

    public JavaPlatform(){
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }
}
