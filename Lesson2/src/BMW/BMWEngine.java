package BMW;

import structure.EngineFactory;

public class BMWEngine extends EngineFactory {
    protected int horsePower = 300;
    protected double speedTo100 = 3.4;
    protected int totalSpeed = 320;

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
