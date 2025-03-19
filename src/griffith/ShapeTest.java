package griffith;

import java.util.*;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 5.0));
        shapes.add(new Rhombus("Rhombus", 4, 6, 5));
        shapes.add(new Rhombus("Rhombus", 6, 8, 7));
        shapes.add(new RightAngledTriangle("Triangle", 3, 4, 5));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8, 10));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }
    }
}