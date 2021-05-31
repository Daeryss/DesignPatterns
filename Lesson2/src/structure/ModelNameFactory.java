package structure;

public class ModelNameFactory implements ModelName{
    protected String modelName;

    @Override
    public void modelName() {
        System.out.println(this.modelName);
    }
}
