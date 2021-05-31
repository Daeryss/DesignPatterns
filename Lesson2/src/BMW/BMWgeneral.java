package BMW;

import structure.*;

public class BMWgeneral extends CarFactory {

    @Override
    public Body getBody() {
        return new BMWBody();
    }

    @Override
    public Color getColor() {
        return new BMWColor();
    }

    @Override
    public Engine getEngine() {
        return new BMWEngine();
    }

    @Override
    public Fuel getFuel() {
        return new BMWFuel();
    }

    @Override
    public ModelName getModelName() {
        return new BMWModelName();
    }

    @Override
    public Year getYear() {
        return new BMWYear();
    }
}
