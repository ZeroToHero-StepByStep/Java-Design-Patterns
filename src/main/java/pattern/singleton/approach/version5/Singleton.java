package pattern.singleton.approach.version5;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by jackz on Feb 11:40 AM, 2019
 *
 * Apart from this, there are some other ways to break the singleton pattern.
 * • If the class is Serializable.
 * • If it’s Clonable.
 * • It can be break by Reﬂection.
 * • And also if, the class is loaded by multiple class loaders.
 *
 * The following example shows how you can protect your class from getting instantiated more than once.
 **/
public class Singleton implements Serializable {

    private static final long serialVersionUID =  -1093810940935189395L;
    private static Singleton sc = new Singleton();

    private Singleton(){
        if(sc != null){
            throw new IllegalStateException("Already created");
        }
    }

    public static Singleton getInstance(){
        return sc;
    }

    public Object readResolve() throws ObjectStreamException{
        return sc;
    }

    public Object wirteReplace() throws ObjectStreamException{
        return sc;
    }

    //Implement the clone() method and throw an exception so that the singleton cannot be cloned.
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton, cannot be cloned");
    }

    //To prevent the singleton getting instantiated from different class loader, implement the getClass() method.
    //The getClass() method associates the classloader with the current thread; if the classloader is null, the
    //method uses the same classloader that loaded the singleton class
    private static Class getClass(String classname) throws ClassNotFoundException{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null){
            classLoader = Singleton.class.getClassLoader();
        }
        return (classLoader.loadClass(classname));
    }

}


