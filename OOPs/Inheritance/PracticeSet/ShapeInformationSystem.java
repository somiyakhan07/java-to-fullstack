// Design a Shape Information System.
// Different shapes share common properties but have their own characteristics.
// Use hierarchical inheritance to organize the classes and display information for each shape.

// Parent class
class Shape {
    // Common properties of all shapes
    private String shapeName;
    private String color;
    private boolean filled;

    // Parameterized constructor
    public Shape(String shapeName, String color, boolean filled) {
        this.shapeName = shapeName;
        this.color = color;
        this.filled = filled;
    }

    // Get shape name
    public String getShapeName() {
        return shapeName;
    }

    // Set shape name
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    // Get shape color
    public String getColor() {
        return color;
    }

    // Set shape color
    public void setColor(String color) {
        this.color = color;
    }

    // Get filled status
    public boolean isFilled() {
        return filled;
    }

    // Set filled status
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

// Child class of Shape
class Circle extends Shape {
    // Circle-specific property
    private double radius;

    // Parameterized constructor
    public Circle(String shapeName, String color, boolean filled, double radius) {
        super(shapeName, color, filled); // call parent constructor
        this.radius = radius; // set circle radius
    }

    // Get radius
    public double getRadius() {
        return radius;
    }

    // Set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

// Child class of Shape
class Rectangle extends Shape {
    // Rectangle-specific properties
    private double height;
    private double width;

    // Parameterized constructor
    public Rectangle(String shapeName, String color, boolean filled, double height, double width) {
        super(shapeName, color, filled); // call parent constructor
        this.height = height; // set rectangle height
        this.width = width; // set rectangle width
    }

    // Get height
    public double getHeight() {
        return height;
    }

    // Set height
    public void setHeight(double height) {
        this.height = height;
    }

    // Get width
    public double getWidth() {
        return width;
    }

    // Set width
    public void setWidth(double width) {
        this.width = width;
    }
}

// Child class of Shape
class Triangle extends Shape {
    // Triangle-specific properties
    private double base;
    private double height;

    // Parameterized constructor
    public Triangle(String shapeName, String color, boolean filled, double base, double height) {
        super(shapeName, color, filled); // call parent constructor
        this.base = base; // set triangle base
        this.height = height; // set triangle height
    }

    // Get base
    public double getBase() {
        return base;
    }

    // Set base
    public void setBase(double base) {
        this.base = base;
    }

    // Get height
    public double getHeight() {
        return height;
    }

    // Set height
    public void setHeight(double height) {
        this.height = height;
    }
}

// Main class
public class ShapeInformationSystem {
    public static void main(String[] args) {

        // Create Circle object
        // Circle can access Shape features + its own radius feature
        Circle c1 = new Circle("Circle", "Blue", true, 5);

        System.out.println("----Circle Details----");
        System.out.println("Shape Name: " + c1.getShapeName());
        System.out.println("Shape Color: " + c1.getColor());
        System.out.println("Shape is filled: " + c1.isFilled());
        System.out.println("Radius of Circle: " + c1.getRadius());

        // Create Rectangle object
        // Rectangle can access Shape features + its own height and width
        Rectangle r1 = new Rectangle("Rectangle", "Pink", false, 10, 15);

        System.out.println();
        System.out.println("----Rectangle Details----");
        System.out.println("Shape Name: " + r1.getShapeName());
        System.out.println("Shape Color: " + r1.getColor());
        System.out.println("Shape is filled: " + r1.isFilled());
        System.out.println("Height of Rectangle: " + r1.getHeight());
        System.out.println("Width of Rectangle: " + r1.getWidth());

        // Create Triangle object
        // Triangle can access Shape features + its own base and height
        Triangle t1 = new Triangle("Triangle", "Green", true, 8, 12);

        System.out.println();
        System.out.println("----Triangle Details----");
        System.out.println("Shape Name: " + t1.getShapeName());
        System.out.println("Shape Color: " + t1.getColor());
        System.out.println("Shape is filled: " + t1.isFilled());
        System.out.println("Base of Triangle: " + t1.getBase());
        System.out.println("Height of Triangle: " + t1.getHeight());
    }
}

/*
Output:

----Circle Details----
Shape Name: Circle
Shape Color: Blue
Shape is filled: true
Radius of Circle: 5.0

----Rectangle Details----
Shape Name: Rectangle
Shape Color: Pink
Shape is filled: false
Height of Rectangle: 10.0
Width of Rectangle: 15.0

----Triangle Details----
Shape Name: Triangle
Shape Color: Green
Shape is filled: true
Base of Triangle: 8.0
Height of Triangle: 12.0
*/