package visitor;

import shapes.*;

public class PerimeterVisitor extends Visitor {

    @Override
    public void visit(Rectangle shape) {
        double perimeter = 2 * (shape.getHeight() + shape.getLength());
        System.out.printf("Area of rectangle with length = %.2f and height = %.2f equals %.2f",
                shape.getLength(),
                shape.getHeight(),
                perimeter);
    }

    @Override
    public void visit(Circle shape) {
        double perimeter = 2 * Math.PI * shape.getRadius();
        System.out.printf("Area of circle with radius r = %.2f equals %.2f\n", shape.getRadius(), perimeter);
    }

    @Override
    public void visit(Triangle figure) {
        double p = (figure.getSide_a() + figure.getSide_b() + figure.getSide_c());
        System.out.printf("Perimeter of triangle with side a = %.2f,  side b = %.2f and side c = %.2f equals %.2f\n",
                figure.getSide_a(),
                figure.getSide_b(),
                figure.getSide_c(),
                p);
    }

}