package shapes;

import visitor.Visitor;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

}
