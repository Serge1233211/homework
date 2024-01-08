public class Main {
    public static void main(String[] args) {
        Circle c =new Circle(2.1);
        Rectangle r =new Rectangle(2.1,2.5);
        Cuboid S=new Cuboid(2,4.7,1);
        System.out.println("perimeter of circle: "+c.calculatePerimeter());
        System.out.println("Area of circle: "+c.calculateArea());
        System.out.println("perimeter of rectangle: "+r.calculatePerimeter());
        System.out.println("Area of rectangle: "+r.calculateArea());
        System.out.println("Surface Area of Cuboid "+S.calculateArea());
        System.out.println("Volume of Cuboid "+S.calculateVolume());


    }
}