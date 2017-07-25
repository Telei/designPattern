package singletonPattern.specialSingleton;

/**
 * Created by huangtinglei on 07/07/2017.
 */
public class RegistrySingletonChild extends RegistrySingleton{
    public RegistrySingletonChild(){}
    static public RegistrySingletonChild getRegistrySingleton(){
        String name=RegistrySingletonChild.class.getName();
        return (RegistrySingletonChild)RegistrySingleton.getRegistrySingleton(name);
    }
    public void test(){
        System.out.println("getClassSuccessChild");
    }
    public static void main(String[] args){
        RegistrySingletonChild registrySingletonChild=RegistrySingletonChild.getRegistrySingleton();
        registrySingletonChild.test();
    }
}
