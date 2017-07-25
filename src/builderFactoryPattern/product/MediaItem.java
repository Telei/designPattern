package builderFactoryPattern.product;

/**
 * Created by huangtinglei on 24/07/2017.
 * 包含不同的媒体元算
 */
public class MediaItem {
    private String s;
    public MediaItem(String s){
        this.s=s;
    }

    @Override
    public String toString() {
        return s;
    }
}
