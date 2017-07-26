package clonePattern;

import java.util.ArrayList;

/**
 * Created by huangtinglei on 26/07/2017.
 */
public class Prototype implements Cloneable{
    private ArrayList list=new ArrayList();
    public Prototype clone(){
        Prototype prototype=null;
        try{
            prototype=(Prototype)super.clone();
            prototype.list=(ArrayList) this.list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return prototype;
    }
}
