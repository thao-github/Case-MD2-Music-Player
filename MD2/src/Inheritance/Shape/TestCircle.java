package Inheritance.Shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(5.5);
        System.out.println(circle2.getPerimeter());

        Circle circle3 = new Circle("pink", false, 8.5);
        System.out.println(circle3);
    }

}
