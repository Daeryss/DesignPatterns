import shapes.*;
import visitor.*;

public class Main {

    public static void main(String[] args) {

        var triangle = new Triangle(10.3,5.6, 10.3);
        var circle = new Circle(4);
        var rectangle = new Rectangle(21.9, 15.6);

        output(triangle);
        System.out.println("\n========================\n");
        output(circle);
        System.out.println("\n========================\n");
        output(rectangle);


    }

    private static void output(Shape shape) {
        shape.accept(new AngleVisitor());
        shape.accept(new DrawVisitor());
        shape.accept(new AreaVisitor());
    }

}
