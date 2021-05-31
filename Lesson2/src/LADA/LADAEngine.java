package LADA;

import structure.EngineFactory;

public class LADAEngine extends EngineFactory {
    protected int horsePower = 89;
    protected double speedTo100 = 8.7;
    protected int totalSpeed = 160;

    @Override
    public void power() {
        System.out.println(this.horsePower);
    }

    @Override
    public void speedTo100() {
        System.out.println(this.speedTo100);
    }

    @Override
    public void totalSpeed() {
        System.out.println(this.totalSpeed);
    }
}
