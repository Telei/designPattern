package simpleFactoryPattern.specificWay;

import simpleFactoryPattern.interfaceRole.Car;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class Driver {
    public static Car driverCar(String s) throws Exception{
        if(s.equalsIgnoreCase("audi")){
            return new AudiCar();
        }else if (s.equalsIgnoreCase("benz")){
            return new BenzCar();
        }else {
            return new BenzCar();
        }
    }
}
