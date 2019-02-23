package pattern.flyweight;

/**
 * Created by Jack on Feb 5:29 PM, 2019
 *
 *
 * The intent of Flyweight Pattern is to use shared objects to support large number of fine-grained
 * objects effectively. A flyweight is a shared object that can be used in multiple contexts simultaneously.
 * The flyweight acts as an independent object in each context - it's indistinguishable from an instance
 * of the object that's not shared. Flyweight cannot make assumption about the context in which they operate.
 * The key concept here is the distinction between intrinsic and extrinsic. Intrinsic state is stored
 * in the flyweight; it consists of information that's independent of the flyweight's context, thereby it's
 * sharable. The extrinsic state depends on and varies with flyweight's context and therefore cannot be shared.
 * Client objects are responsible for passing extrinsic state to the flyweight when it needs it.
 *
 * The Flyweight pattern's effectiveness depends on how and where it's used. Apply the Flyweight
 * pattern when all of the following are true:
 *
 * • An application uses a large number of objects.
 * • Storage costs are high because of the sheer quantity of objects.
 * • Most objects state can be made extrinsic.
 * • Many groups of objects may be replaced by relatively few shared objects once extrinsic state
 * is removed
 * • The application doesn't depend on object identity. Since flyweight objects may be shared, identity
 * tests will return true for conceptually distinct objects.
 **/
public class TestFlyweight {

    public static void main(String []args){
        Code code = new Code();
        code.setCode("C code...");
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*****************************************");

        code = new Code();
        code.setCode("C code2...");
        platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*****************************************");

        code = new Code();
        code.setCode("JAVA Code...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*****************************************");

        code = new Code();
        code.setCode("JAVA Code2...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*****************************************");

        code = new Code();
        code.setCode("RUBY Code...");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println("*****************************************");

        code = new Code();
        code.setCode("RUBY Code2");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
    }
}
