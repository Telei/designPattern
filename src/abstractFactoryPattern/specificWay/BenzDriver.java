package abstractFactoryPattern.specificWay;

import abstractFactoryPattern.interfaceRole.Car;
import abstractFactoryPattern.interfaceRole.Driver;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class BenzDriver implements Driver {

    @Override
    public void show() {
        System.out.println("This is a wonderful racing game！");
    }
}
