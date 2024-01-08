// Define a class for circle that inherits from shape
class Circle extends Shape {
    // Declare the radius attribute
    private double radius;

    // Define a constant for pi
    private static final double PI = 3.14;

    // Define a constructor to initialize the object with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the method to calculate the perimeter of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    // Override the method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return 0;
    }

    // Define a method to output the radius of the circle
}
