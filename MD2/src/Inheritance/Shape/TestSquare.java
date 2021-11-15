package Inheritance.Shape;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.3);
        System.out.println(square);

        square = new Square("green",true, 6.0);
        System.out.println((square));
    }
}
