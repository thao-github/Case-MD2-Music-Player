package Inheritance.Shape;

    class Circle extends Shape {
    private double radius;

        public Circle() {
           radius = 0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return radius * 2 * Math.PI;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "A Circle with radius= " + getRadius() + " which is a subclass of " + super.toString() +'}';
        }
    }

