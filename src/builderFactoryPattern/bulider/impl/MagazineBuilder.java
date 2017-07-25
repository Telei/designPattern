package builderFactoryPattern.bulider.impl;

import builderFactoryPattern.bulider.MediaBuilder;
import builderFactoryPattern.product.Media;
import builderFactoryPattern.product.MediaItem;
import builderFactoryPattern.product.impl.Magazine;

/**
 * Created by huangtinglei on 24/07/2017.
 */
public class MagazineBuilder extends MediaBuilder{
    private Magazine magazine;
    public void buildBase(){
        System.out.println("Building magazine framework");
        magazine=new Magazine();
    }
    public void addMediaItem(MediaItem article){
        System.out.println("Adding article "+article);
        magazine.add(article);
    }
    public Media getFinishedMedia(){
        return magazine;
    }
}
