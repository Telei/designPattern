package builderFactoryPattern.bulider.impl;

import builderFactoryPattern.bulider.MediaBuilder;
import builderFactoryPattern.product.Media;
import builderFactoryPattern.product.MediaItem;
import builderFactoryPattern.product.impl.WebSite;

/**
 * Created by huangtinglei on 24/07/2017.
 */
public class WebSiteBuilder extends MediaBuilder{
    private WebSite webSite;
    public void buildBase(){
        System.out.println("Building webSite framework");
        webSite=new WebSite();
    }
    public void addMediaItem(MediaItem webItem){
        System.out.println("Adding web item "+webItem);
        webSite.add(webItem);
    }
    public Media getFinishedMedia(){
        return webSite;
    }
}
