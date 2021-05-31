package structure;

public class ColorFactory implements Color {
    protected String colorName;

    @Override
    public void color() {
        System.out.println(this.colorName);
    }
}
