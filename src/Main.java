public class Main {
    public static void main(String[] args) {
        Circle c =new Circle(2.1);
        Rectangle r =new Rectangle(2.1,2.5);
        System.out.println("perimeter of circle: "+c.calculatePerimeter());
        System.out.println("Area of circle: "+c.calculateArea());
        System.out.println("perimeter of rectangle: "+r.calculatePerimeter());
        System.out.println("perimeter of rectangle: "+r.calculateArea());
    }
}