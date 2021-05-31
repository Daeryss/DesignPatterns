package structure;

public class FuelFactory implements Fuel{
    protected String fuelType;
    protected double fuelConsumption;

    @Override
    public void fuel() {
        System.out.println(this.fuelType);
    }

    @Override
    public void fuelConsumption() {
        System.out.println(this.fuelConsumption);
    }
}
