package Kia;

import structure.FuelFactory;

public class KiaFuel extends FuelFactory {
    protected String fuelType = "diesel";
    protected double fuelConsumption = 5.4;

    @Override
    public void fuel() {
        System.out.println(this.fuelType);
    }

    @Override
    public void fuelConsumption() {
        System.out.println(this.fuelConsumption);
    }
}
