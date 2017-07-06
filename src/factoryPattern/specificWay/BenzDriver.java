package factoryPattern.specificWay;

import factoryPattern.interfaceRole.Car;
import factoryPattern.interfaceRole.Driver;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class BenzDriver implements Driver{

    @Override
    public Car driverCar() {
        return new BenzCar();
    }
}
