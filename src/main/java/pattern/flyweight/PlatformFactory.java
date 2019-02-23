package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack on Feb 5:20 PM, 2019
 **/
public final class PlatformFactory {

    private static Map<String,Platform> map = new HashMap<>();

    private PlatformFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }

    //synchronized is order to provide the thread safety while checking and creating the instance of object
    public static synchronized Platform getPlatformInstance(String platformType){
        Platform platform = map.get(platformType);
        if(platform == null){
            switch (platformType){
                case "C": platform = new CPlatform();break;
                case "CPP": platform = new CPPPlatform();break;
                case "JAVA": platform = new JavaPlatform();break;
                case "RUBY": platform = new RubyPlatform();break;

            }
            map.put(platformType,platform);
        }
        return platform;
    }
}
