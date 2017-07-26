package clonePattern.client;

import clonePattern.ConcretePrototype;
import clonePattern.Prototype;
import clonePattern.PrototypeManager;

public class PrototypeClient {
    public static void main(String[] args){
        ConcretePrototype cp=new ConcretePrototype();
        ConcretePrototype cloneCp=(ConcretePrototype) cp.clone();
        cloneCp.show();
        Prototype p=new ConcretePrototype();
        Prototype _p1=p.clone();
        System.out.println("-----"+_p1.getClass().getName());
        Prototype p1= PrototypeManager.getPm().getPrototype(_p1.getClass().getName());
        System.out.println("******"+p1.getClass().getName());
        Prototype p2= PrototypeManager.getPm().getPrototype(_p1.getClass().getName());
        System.out.println("~~~~~~"+p2.getClass().getName());

    }
}
