package BMW;

import structure.FuelFactory;

public class BMWFuel extends FuelFactory {
    protected String fuelType = "electric engine";
    protected double fuelConsumption = 0;

    @Override
    public void fuel() {
        System.out.println(this.fuelType);
    }

    @Override
    public void fuelConsumption() {
        System.out.println(this.fuelConsumption);
    }
}
