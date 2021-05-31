package LADA;

import structure.ModelNameFactory;

public class LADAModelName extends ModelNameFactory {
    protected String modelName = "Largus";

    @Override
    public void modelName() {
        System.out.println(this.modelName);
    }
}
