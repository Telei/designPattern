package builderFactoryPattern.bulider.impl;

import builderFactoryPattern.bulider.MediaBuilder;
import builderFactoryPattern.product.Media;
import builderFactoryPattern.product.MediaItem;
import builderFactoryPattern.product.impl.Book;

/**
 * Created by huangtinglei on 24/07/2017.
 */
public class BookBuilder extends MediaBuilder{
    private Book book;
    public void buildBase(){
        System.out.println("Building book framework");
        book=new Book();
    }
    public void addMediaItem(MediaItem chapter){
        System.out.println("Adding chapter "+chapter);
        book.add(chapter);
    }
    public Media getFinishedMedia(){
        return book;
    }
}
