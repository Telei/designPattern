package abstractFactoryPattern.specificWay;

import abstractFactoryPattern.interfaceRole.Car;
import abstractFactoryPattern.interfaceRole.Driver;
import abstractFactoryPattern.interfaceRole.SportsCar;

/**
 * Created by huangtinglei on 06/07/2017.
 */
public class RaceingCompetition implements SportsCar{
    @Override
    public Car fastCar() {
        return new BenzCar();//return new AudiCar();
    }

    @Override
    public Driver racer() {
        return new BenzDriver();
    }
}
