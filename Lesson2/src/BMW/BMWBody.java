package BMW;

import structure.BodyFactory;

public class BMWBody extends BodyFactory {
    protected String bodyType = "coupe";

    @Override
    public void bodyType() {
        System.out.println(this.bodyType);
    }
}
