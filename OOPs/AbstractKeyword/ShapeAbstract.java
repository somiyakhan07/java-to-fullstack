// Create an abstract class Shape.
// Add an abstract method area().
// Create Circle and Rectangle.
// Implement area() in both classes.
// Create objects and print their areas.
// Covers: Abstract method + overriding.

abstract class Shape {
    abstract public double area(); // Abstract method
}

class Circle extends Shape {
    static final double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius; // this refers to current object
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() { // Override abstract area() method
        return PI * (radius * radius);
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length; // this refers to current object
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double area() { // Override abstract area() method
        return length * breadth;
    }
}

public class ShapeAbstract {
    public static void main(String[] args) {

        Shape s1 = new Circle(10); // Upcasting: Shape reference + Circle object
        double result1 = s1.area(); // Circle's overridden area() executes
        System.out.println("Type Shape and object cirle area: " + result1);
        System.out.println();

        Shape s2 = new Rectangle(10, 15); // Upcasting: Shape reference + Rectangle object
        double result2 = s2.area(); // Rectangle's overridden area() executes
        System.out.println("Type Shape and object rectangle area: " + result2);
        System.out.println();

        Circle c1 = new Circle(24.5); // Circle reference + Circle object
        double result3 = c1.area();
        System.out.println("Type Circle and object Circle- " + "Radius: " + c1.getRadius() + " Area= " + result3);
        System.out.println();

        Rectangle r1 = new Rectangle(25, 30); // Rectangle reference + Rectangle object
        double result4 = r1.area();
        System.out.println("Type Recatangle and object Rectangle- " + "Length:" + r1.getLength() + " * " + "Breadth:" + r1.getBreadth() + " Area= " + result4);

    }

}

/* output:
Type Shape and object cirle area: 314.0

Type Shape and object rectangle area: 150.0

Type Circle and object Circle- Radius: 24.5 Area= 1884.785

Type Recatangle and object Rectangle- Length:25.0 * Breadth:30.0 Area= 750.0
*/