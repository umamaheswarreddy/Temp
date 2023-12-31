package DesignPatterns;

/**
 * Q) What Is Singleton Design Pattern?
 *
 * Singleton pattern is one of the simplest design patterns in Java.
 * This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
 * This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 */
public class SingletonClass {

    /**
     * static - memory will be allocated only once while class instantiated
     * private - can not access directly to this variable. we can access only get method
     * private instance, so that it can be accessed by only by getInstance() method
     */
    private static SingletonClass singletonInstance= new SingletonClass();
     // we are using eager loading here . object created at the time of class creation only.
    // we can try lazy loading also. fo that we need to check getInstance method .if object is available or not
    // if it is null we will instantiate object.

    //in lazy loading just we declare variable like this

    /**
     *   private static SingletonClass singletonInstance;
     */




    private SingletonClass(){
           // can not create object using new keyword using this Private Constructor
    }

    /**
     * synchronized method to control simultaneous access in multi thread environment
     *
     *  EX: synchronized public static SingletonClass getInstance(){
     *         return singletonInstance;
     *     }
     */
    public static SingletonClass getInstance(){
        // get the only object available
        return singletonInstance;
    }

    public void simpleMethod(){
        System.out.println("hashcode of singleton Object "+singletonInstance);
    }

    public static SingletonClass getInstanceForLazyLoading() {
        if (singletonInstance == null) {
            // if instance is null, initialize
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }

}
