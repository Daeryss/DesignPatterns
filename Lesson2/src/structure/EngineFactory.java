package structure;

public class EngineFactory implements Engine{
    protected int horsePower;
    protected double speedTo100;
    protected int totalSpeed;

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
