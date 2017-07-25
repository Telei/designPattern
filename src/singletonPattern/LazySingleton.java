package singletonPattern;

/**
 * Created by huangtinglei on 07/07/2017.
 *  懒汉式
 */
public class LazySingleton {
    private static  LazySingleton instance;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance() {
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
