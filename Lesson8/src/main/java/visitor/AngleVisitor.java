package visitor;

import shapes.*;

public class AngleVisitor extends Visitor {

    @Override
    public void visit(Rectangle shape) {
        int angle = 4;
        print(shape, angle);
    }

    @Override
    public void visit(Circle shape) {
        int angle = 0;
        print(shape, angle);
    }

    @Override
    public void visit(Triangle shape) {
        int angle = 3;
        print(shape, angle);
    }

    private void print(Shape figure, int angle) {
        System.out.printf("%s has %d angles\n", figure.getName(), angle);
    }

}
