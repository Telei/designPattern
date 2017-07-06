package abstractFactoryPattern.specificWay;

import abstractFactoryPattern.interfaceRole.Car;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class BenzCar implements Car {
    @Override
    public void driver() {
        System.out.println("Racer driver Benz to competition!");
    }
}
