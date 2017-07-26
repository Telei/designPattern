package clonePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangtinglei on 26/07/2017.
 * 原型管理器
 */
public class PrototypeManager {
    private static PrototypeManager pm;
    private Map prototypes=null;
    private PrototypeManager(){
        prototypes=new HashMap();
    }

    //使用单例模式来得到原型管理器的唯一实例
    public static  PrototypeManager getPm() {
        if(pm==null){
            pm=new PrototypeManager();
        }
        return pm;
    }
    public void register(String name,Object prototype){
        prototypes.put(name,prototype);
        System.out.println("Class "+name+" 注册成功！");
    }
    public void unregister(String name){
        prototypes.remove(name);
        System.out.println("Class "+name+" 删除成功！");
    }
    public Prototype getPrototype(String name){
        if(prototypes.containsKey(name)){
            System.out.println("Class "+name+" 用户已经存在！");
            return ((Prototype)prototypes.get(name)).clone();
        }else{
            Prototype object=null;
            try{
                object=(Prototype) Class.forName(name).newInstance();
                register(name,object);
            }catch (Exception e){
                System.out.println("Class "+name+" 没有实际意义！    ");
            }
            return object;
        }

    }
}
