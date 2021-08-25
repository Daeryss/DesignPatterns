package shapes;

import visitor.Visitor;

public class Rectangle extends Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        super("Rectangle");
        this.length = length;
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

}
