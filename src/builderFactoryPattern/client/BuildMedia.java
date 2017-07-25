package builderFactoryPattern.client;
import builderFactoryPattern.bulider.impl.BookBuilder;
import builderFactoryPattern.bulider.impl.MagazineBuilder;
import builderFactoryPattern.bulider.impl.WebSiteBuilder;
import builderFactoryPattern.director.MediaDirector;
import builderFactoryPattern.product.Media;
import builderFactoryPattern.product.MediaItem;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * Created by huangtinglei on 24/07/2017.
 * 测试，客户程序角色
 */
public class BuildMedia  extends TestCase {

    private List input= Arrays.asList(new MediaItem[]{
            new MediaItem("Item1"),new MediaItem("Item2"),
            new MediaItem("Item3"),new MediaItem("Item4")
    });

    public void testBook(){
        MediaDirector buildBook=new MediaDirector(new BookBuilder());
        Media book=buildBook.produceMedia(input);
        String result="book:"+book;
        System.out.println(result);
        assertEquals(result,"book:[Item1, Item2, Item3, Item4]");
    }
    public void testMagazine(){
        MediaDirector buildMagazine=new MediaDirector(new MagazineBuilder());
        Media magazine=buildMagazine.produceMedia(input);
        String result="magazine:"+magazine;
        System.out.println(result);
        assertEquals(result,"magazine:[Item1, Item2, Item3, Item4]");
        
    }
    public void testWebSite(){
        MediaDirector buildWebSite=new MediaDirector(new WebSiteBuilder());
        Media website=buildWebSite.produceMedia(input);
        String result="web site"+website;
        assertEquals(result,"web site[Item1, Item2, Item3, Item4]");
    }
    public static void main(String[] args){
        junit.textui.TestRunner.run(BuildMedia.class);
    }
}
