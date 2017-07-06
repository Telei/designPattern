package simpleFactoryPattern.specificWay;

import simpleFactoryPattern.interfaceRole.Car;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class BenzCar implements Car{
    @Override
    public void driver() {
        System.out.println("BenzDriver Benz");
    }
}
