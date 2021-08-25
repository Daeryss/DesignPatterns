package shapes;

import visitor.Visitor;

public class Triangle extends Shape {

    //heights of triangle's sides
    private double side_a;
    private double side_b;
    private double side_c;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Triangle(double side_a, double side_b, double side_c) {
        super("Triangle");
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_c() {
        return side_c;
    }
}
