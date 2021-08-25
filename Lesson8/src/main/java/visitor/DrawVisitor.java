package visitor;

import shapes.*;

public class DrawVisitor extends Visitor {

    @Override
    public void visit(Rectangle shape) {
        System.out.printf("it is rectangle with length = %.2f and height = %.2f\n",
                shape.getLength(),
                shape.getHeight());
    }

    @Override
    public void visit(Circle shape) {
        System.out.printf("it is circle with radius r = %.2f\n", shape.getRadius());
    }

    @Override
    public void visit(Triangle shape) {
        System.out.printf("It is a triangle with side a = %.2f,  side b = %.2f and side c = %.2f\n",
                shape.getSide_a(),
                shape.getSide_b(),
                shape.getSide_c());
    }

}
