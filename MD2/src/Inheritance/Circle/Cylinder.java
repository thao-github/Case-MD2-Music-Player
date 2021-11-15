package Inheritance.Circle;

class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {

        this.height = height;
    }

    public Cylinder(
            double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getArea1() { //dien tich xung quanh
        super.setRadius(10);
        return super.getPerimeter() * height;

    }

    public double getArea2() { //dien tich toan phan
        return (super.getPerimeter() * 2) * (height + radius);
    }

    public double getVolume() {
        return (super.getArea() * height);

    }
}
