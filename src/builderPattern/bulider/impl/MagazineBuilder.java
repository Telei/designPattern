package builderPattern.bulider.impl;

import builderPattern.bulider.MediaBuilder;
import builderPattern.product.Media;
import builderPattern.product.MediaItem;
import builderPattern.product.impl.Magazine;

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
