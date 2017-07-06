package abstractFactoryPattern.client;

import abstractFactoryPattern.interfaceRole.Driver;
import abstractFactoryPattern.interfaceRole.SportsCar;
import abstractFactoryPattern.specificWay.BenzDriver;
import abstractFactoryPattern.specificWay.RaceingCompetition;

/**
 * Created by huangtinglei on 2017/7/5.
 */
public class Magnate {
    public static void main(String[] args){
        try {
            SportsCar race=new  RaceingCompetition();
            race.fastCar().driver();
            race.racer().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
