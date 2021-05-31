package structure;

public class BodyFactory implements Body{
    protected String bodyType;

    @Override
    public void bodyType() {
        System.out.println(this.bodyType);
    }
}
