package visitor;

import shapes.*;

public abstract class Visitor {

    public abstract void visit(Rectangle shape);

    public abstract void visit(Circle shape);

    public abstract void visit(Triangle shape);
}
