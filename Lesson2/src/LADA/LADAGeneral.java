package LADA;

import structure.*;

public class LADAGeneral extends CarFactory {

    @Override
    public Body getBody() {
        return new LADABody();
    }

    @Override
    public Color getColor() {
        return new LADAColor();
    }

    @Override
    public Engine getEngine() {
        return new LADAEngine();
    }

    @Override
    public Fuel getFuel() {
        return new LADAFuel();
    }

    @Override
    public ModelName getModelName() {
        return new LADAModelName();
    }

    @Override
    public Year getYear() {
        return new LADAYear();
    }
}
