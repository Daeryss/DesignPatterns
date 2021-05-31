package Kia;

import structure.BodyFactory;

public class KiaBody extends BodyFactory {
    protected String bodyType = "suv";

    @Override
    public void bodyType() {
        System.out.println(this.bodyType);
    }
}
