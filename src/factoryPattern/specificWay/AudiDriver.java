package factoryPattern.specificWay;

import factoryPattern.interfaceRole.Car;
import factoryPattern.interfaceRole.Driver;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class AudiDriver implements Driver{
    @Override
    public Car driverCar() {
        return new AudiCar();
    }
}
