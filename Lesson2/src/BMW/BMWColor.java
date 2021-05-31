package BMW;

import structure.ColorFactory;

public class BMWColor extends ColorFactory {
    protected String colorName = "blue";

    @Override
    public void color() {
        System.out.println(this.colorName);
    }
}
