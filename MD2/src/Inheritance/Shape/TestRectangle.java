package Inheritance.Shape;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle ();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0, 10.5);
        System.out.println("Area is: " + rectangle.getArea() + " and " + "Perimeter is: " + rectangle.getPerimeter());

        rectangle = new Rectangle("orange", true,5.0, 10.5);
        System.out.println(rectangle);
    }
}
