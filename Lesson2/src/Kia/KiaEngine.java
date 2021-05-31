package Kia;

import structure.EngineFactory;

public class KiaEngine extends EngineFactory {
    protected int horsePower = 121;
    protected double speedTo100 = 6.4;
    protected int totalSpeed = 210;

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
