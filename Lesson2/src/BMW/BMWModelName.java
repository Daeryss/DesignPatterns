package BMW;

import structure.ModelNameFactory;

public class BMWModelName extends ModelNameFactory {
    protected String modelName = "i8";

    @Override
    public void modelName() {
        System.out.println(this.modelName);
    }
}
