package shapes;

import visitor.Visitor;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

}
