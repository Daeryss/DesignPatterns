package LADA;

import structure.BodyFactory;

public class LADABody extends BodyFactory {
    protected String bodyType = "vagon";

    @Override
    public void bodyType() {
        System.out.println(this.bodyType);
    }
}
