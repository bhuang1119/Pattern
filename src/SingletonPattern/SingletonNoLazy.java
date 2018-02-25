package SingletonPattern;

/**
 * 饿汉式
 */
public class SingletonNoLazy {
    private static SingletonNoLazy instance = new SingletonNoLazy();
    private SingletonNoLazy(){}
    public static SingletonNoLazy getInstance(){
        return instance;
    }
}
