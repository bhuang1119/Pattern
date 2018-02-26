package SingletonPattern;

/**
 * 登记式/静态内部类
 */
public class SingletonStatic {
    private static class SingletonHolder{
        private static final SingletonStatic instance = new SingletonStatic();
    }
    private SingletonStatic(){}
    public static final SingletonStatic getInstance(){
        return SingletonHolder.instance;
    }
}
