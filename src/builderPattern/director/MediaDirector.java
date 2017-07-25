package builderPattern.director;

import builderPattern.bulider.MediaBuilder;
import builderPattern.product.Media;
import builderPattern.product.MediaItem;

import java.util.Iterator;
import java.util.List;

/**
 * Created by huangtinglei on 24/07/2017.
 * 导演者角色
 */
public class MediaDirector {
    private MediaBuilder mb;
    public MediaDirector(MediaBuilder mb){
        this.mb=mb;//具有策略模式相似特征
    }
    public Media produceMedia(List input){
        mb.buildBase();
        for (Iterator it=input.iterator();it.hasNext();){
            mb.addMediaItem((MediaItem) it.next());
        }
        return mb.getFinishedMedia();
    }
}
