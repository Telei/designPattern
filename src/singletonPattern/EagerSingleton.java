package singletonPattern;

/**
 * Created by huangtinglei on 07/07/2017.
 * 饿汉式
 */
public class EagerSingleton {
    private static EagerSingleton instance=new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
