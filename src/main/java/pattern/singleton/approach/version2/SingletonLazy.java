package pattern.singleton.approach.version2;

/**
 * Better Approach:
 * A version2 approach that an object should get create when it is required. So, we will create an object on the
 * first call and then will return the same object on other successive calls.
 *
 * Problem:
 * Considering multi-thread environment, imagine two threads concurrently accessing the class, thread t1 give the
 * first call to the getInstance() method, it checks if the static variable sc is null and then gets interrupted due
 * do some reason. Another thread t2 calls the getInstance() method successfully passes the if check and instantiates
 * the object. Then, thread t1 gets awake and it also creates the object. At this time, there would be two objects of
 * this class.
 * */

public class SingletonLazy {

    //Change src to null, instantiate it when there is a call
    private static SingletonLazy src = null;
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){

        if(src == null){
            src = new SingletonLazy();
        }
        return src;
    }
}
