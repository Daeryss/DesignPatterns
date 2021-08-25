package visitor;

import shapes.*;

public class AreaVisitor extends Visitor {

    @Override
    public void visit(Rectangle shape) {
        double area = shape.getHeight() * shape.getLength();
        System.out.printf("Area of rectangle with length = %.2f and height = %.2f equals %.2f",
                shape.getLength(),
                shape.getHeight(),
                area);
    }

    @Override
    public void visit(Circle shape) {
        double area = Math.PI * Math.pow(shape.getRadius(), 2);
        System.out.printf("Area of circle with radius r = %.2f equals %.2f\n", shape.getRadius(), area);
    }

    @Override
    public void visit(Triangle shape) {
        // p is half-perimeter
        double p = (shape.getSide_a() + shape.getSide_b() + shape.getSide_c()) / 2;
        //Heron's function for calculating triangle's area
        double area = Math.sqrt(p * (p - shape.getSide_a() * (p - shape.getSide_b() * (p - shape.getSide_c()))));
        System.out.printf("Area of triangle with side a = %.2f,  side b = %.2f and side c = %.2f equals %.2f\n",
                shape.getSide_a(),
                shape.getSide_b(),
                shape.getSide_c(),
                area);
    }
}
