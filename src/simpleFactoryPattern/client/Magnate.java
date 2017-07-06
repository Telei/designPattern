package simpleFactoryPattern.client;

import simpleFactoryPattern.interfaceRole.Car;
import simpleFactoryPattern.specificWay.Driver;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class Magnate {
    public static void main(String[] args){
        try {
            Car car= Driver.driverCar("audi");
            car.driver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
