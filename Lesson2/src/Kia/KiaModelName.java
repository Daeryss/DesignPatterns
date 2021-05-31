package Kia;

import structure.ModelNameFactory;

public class KiaModelName extends ModelNameFactory {
    protected String modelName = "Sportage";

    @Override
    public void modelName() {
        System.out.println(this.modelName);
    }
}
