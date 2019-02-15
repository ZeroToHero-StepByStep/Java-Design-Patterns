package pattern.singleton.approach.version4;

/**
 * Created by jackz on Feb 10:20 AM, 2019
 *
 * Good Approach:
 * If you do want to use the synchronization, there is another technique known as "double-checked locking" ot reduce
 * the use of synchronization. With the double-checked locking, we first check to see if an instance is created, and
 * if not, then we synchronize. This way, we only synchronized the first time.
 *
 *
 * 1.Check that the variable is initialized (without obtaining the lock). If it is initialized, return it immediately.
 * 2.Obtain the lock.
 * 3.Double-check whether the variable has already been initialized: if another thread acquired the lock first, it may have already done the initialization. If so, return the initialized variable.
 * 4.Otherwise, initialize and return the variable.
 **/
public class SingletonLazyDoubleCheck {

    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}

    public static SingletonLazyDoubleCheck getInstance(){
        if(sc == null){
            synchronized (SingletonLazyDoubleCheck.class){
                if (sc == null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }

}


