package Inheritance.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"yellow");
        System.out.println("Area is: " + circle.getArea() + " and Perimeter is: " + circle.getPerimeter());
    }

}
