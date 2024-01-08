class Rectangle extends Shape {
    // Declare the length and width attributes
    private double length;
    private double width;

    // Define a constructor to initialize the object with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the method to calculate the perimeter of the quadrilateral
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Override the method to calculate the area of the quadrilateral
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Define a method to output the length and width of the quadrilateral
    public void printDimensions() {
        System.out.println("The length of the quadrilateral is " + length);
        System.out.println("The width of the quadrilateral is " + width);
    }
}