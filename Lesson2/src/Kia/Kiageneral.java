package Kia;

import structure.*;

public class Kiageneral extends CarFactory {

    @Override
    public Body getBody() {
        return new KiaBody();
    }

    @Override
    public Color getColor() {
        return new KiaColor();
    }

    @Override
    public Engine getEngine() {
        return new KiaEngine();
    }

    @Override
    public Fuel getFuel() {
        return new KiaFuel();
    }

    @Override
    public ModelName getModelName() {
        return new KiaModelName();
    }

    @Override
    public Year getYear() {
        return new KiaYear();
    }
}
