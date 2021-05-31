import BMW.*;
import Kia.Kiageneral;
import LADA.LADAGeneral;
import structure.*;

public class Cars {
    public static void main(String[] args) {
        System.out.println("BMW");
        CarFactory bmw = new BMWgeneral();

        Body bmwBody = bmw.getBody();
        Color bmwColor = bmw.getColor();
        Engine bmwEngine = bmw.getEngine();
        Fuel bmwFuel = bmw.getFuel();
        ModelName bmwModelName = bmw.getModelName();
        Year bmwYear = bmw.getYear();

        bmwModelName.modelName();
        bmwBody.bodyType();
        bmwColor.color();
        bmwEngine.power();
        bmwEngine.speedTo100();
        bmwEngine.totalSpeed();
        bmwFuel.fuel();
        bmwFuel.fuelConsumption();
        bmwYear.year();
        System.out.println();

        System.out.println("KIA");
        CarFactory kia = new Kiageneral();

        Body kiaBody = kia.getBody();
        Color kiaColor = kia.getColor();
        Engine kiaEngine = kia.getEngine();
        Fuel kiaFuel = kia.getFuel();
        ModelName kiaModelName = kia.getModelName();
        Year kiaYear = kia.getYear();

        kiaModelName.modelName();
        kiaBody.bodyType();
        kiaColor.color();
        kiaEngine.power();
        kiaEngine.speedTo100();
        kiaEngine.totalSpeed();
        kiaFuel.fuel();
        kiaFuel.fuelConsumption();
        kiaYear.year();
        System.out.println();

        System.out.println("LADA");
        CarFactory lada = new LADAGeneral();

        Body ladaBody = lada.getBody();
        Color ladaColor = lada.getColor();
        Engine ladaEngine = lada.getEngine();
        Fuel ladaFuel = lada.getFuel();
        ModelName ladaModelName = lada.getModelName();
        Year ladaYear = lada.getYear();

        ladaModelName.modelName();
        ladaBody.bodyType();
        ladaColor.color();
        ladaEngine.power();
        ladaEngine.speedTo100();
        ladaEngine.totalSpeed();
        ladaFuel.fuel();
        ladaFuel.fuelConsumption();
        ladaYear.year();

    }
}
