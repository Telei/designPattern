package singletonPattern.specialSingleton;

import java.util.HashMap;

/**
 * Created by huangtinglei on 07/07/2017.
 * 登记式单例
 */
public class RegistrySingleton {
    private static HashMap sinRegistry=new HashMap();
    static private RegistrySingleton registrySingleton =new RegistrySingleton();
    //受保护的构造方法
    protected RegistrySingleton(){

    }

    public static RegistrySingleton getRegistrySingleton(String name) {
        if (name==null)
             //name="RegistrySingleton";
            name=RegistrySingleton.class.getName();
        if(sinRegistry.get(name)==null){
            try {
                sinRegistry.put(name,Class.forName(name).newInstance());
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return (RegistrySingleton) sinRegistry.get(name);
    }
    public void test(){
        System.out.println("getClassSuccess");
    }
    public static void main(String[] args){
        RegistrySingleton registrySingleton=RegistrySingleton.getRegistrySingleton("singletonPattern.specialSingleton.RegistrySingleton");
        registrySingleton.test();
    }
}
