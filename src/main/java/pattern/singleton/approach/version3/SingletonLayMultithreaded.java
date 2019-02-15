package pattern.singleton.approach.good;

/**
 * Good Approach:
 *
 * To avoid the issue of SingletonLazy in multi-thread environment, we can use the synchronized keyword to the
 * getInstance() method. With this way, we force every thread to wait its turn before it can enter the method. So,
 * no two threads will enter the method at the same time.
 *
 * Problem:
 * The synchronized comes with a price, it will decrease the performance, but if the call to the getInstance() method
 * isn't casuing a substantial overhead for your application, forget about it.
 *
 * */
public class SingletonLayMultithreaded {

    private static SingletonLayMultithreaded sc = null;
    private SingletonLayMultithreaded(){}
    public static synchronized SingletonLayMultithreaded getInstance(){

        if(sc == null){
            sc = new SingletonLayMultithreaded();
        }
        return sc;
    }


}
