// Area Calculator
// Create overloaded or compile time polymorphism area() methods to calculate the area of:
// Square
// Rectangle
// Circle

class Area {
    // Square
    public double area(double side) {
        return side * side;
    }

    // Rectangle
    public int area(int length, int breadth) {
        return length * breadth;
    }

    // Circle
    public double area(float pie, double radius) {
        return pie * (radius * radius);
    }
}

public class CalcArea {
    public static void main(String[] args) {
        Area a1 = new Area();
        double areaOfSquare = a1.area(5);
        System.out.println("Area of square: " + areaOfSquare);

        int areaOfRectangle = a1.area(23,10);
        System.out.println("Area of rectangle: " + areaOfRectangle);

        double areaOfCircle = a1.area(3.14f, 5);
        System.out.println("Area of circle: " + areaOfCircle);
    }
}

/*output:
Area of square: 25.0
Area of rectangle: 230
Area of circle: 78.50000262260437
 */