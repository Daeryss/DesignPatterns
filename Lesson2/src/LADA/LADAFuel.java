package LADA;

import structure.FuelFactory;

public class LADAFuel extends FuelFactory {
    protected String fuelType = "petrol";
    protected double fuelConsumption = 8.9;

    @Override
    public void fuel() {
        System.out.println(this.fuelType);
    }

    @Override
    public void fuelConsumption() {
        System.out.println(this.fuelConsumption);
    }
}
