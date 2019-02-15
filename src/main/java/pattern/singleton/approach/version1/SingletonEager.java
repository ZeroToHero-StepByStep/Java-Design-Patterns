package pattern.singleton.approach.version1;

/**
 * Bad Approach:
 * Our singleton class which makes sure only one object of the class gets created
 * even if there are several requests, ony the same instantiated object will be returned
 *
 * Problem:
 * The object would get created as soon as the class gets loaded into JVM. If the object is
 * never requested, there would be an object useless inside the memory.
 * */
public class SingletonEager {

    //Providing a direct access to a class member is not a version2 idea, so using SingletonEar instead
    private static SingletonEager scr = new SingletonEager();

    //Keeping the constructor private, no other class can instantiate this class
    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return scr;
    }

}
