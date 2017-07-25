package builderPattern.bulider.impl;

import builderPattern.bulider.MediaBuilder;
import builderPattern.product.Media;
import builderPattern.product.MediaItem;
import builderPattern.product.impl.WebSite;

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
