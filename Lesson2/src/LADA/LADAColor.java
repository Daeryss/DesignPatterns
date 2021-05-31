package LADA;

import structure.ColorFactory;

public class LADAColor extends ColorFactory {
    protected String colorName = "white";

    @Override
    public void color() {
        System.out.println(this.colorName);
    }
}
