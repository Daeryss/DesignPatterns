package Kia;

import structure.ColorFactory;

public class KiaColor extends ColorFactory {
    protected String colorName = "gray";

    @Override
    public void color() {
        System.out.println(this.colorName);
    }
}
