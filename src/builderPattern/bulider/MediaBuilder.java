package builderPattern.bulider;

import builderPattern.product.Media;
import builderPattern.product.MediaItem;

/**
 * Created by huangtinglei on 24/07/2017.
 * 抽象建造者角色，规范了所有媒体建造的步骤
 */
public class MediaBuilder {
    public void buildBase(){}
    public void addMediaItem(MediaItem item){}
    public Media getFinishedMedia(){
        return null;
    }
}
