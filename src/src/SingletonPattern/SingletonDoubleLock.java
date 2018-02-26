package SingletonPattern;

/**
 * 双重锁/双重校检锁
 */
public class SingletonDoubleLock {
    private volatile  static SingletonDoubleLock instance;
    private SingletonDoubleLock(){}
    public static SingletonDoubleLock getInstance(){
        if(instance==null){
            synchronized (SingletonDoubleLock.class){
                if (instance==null){
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
