package factoryPattern.client;

import factoryPattern.interfaceRole.Driver;
import factoryPattern.specificWay.BenzDriver;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class Magnate {
    public static void main(String[] args){
        try {
            Driver driver=new BenzDriver();
            driver.driverCar().driver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
