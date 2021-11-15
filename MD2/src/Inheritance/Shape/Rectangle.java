package Inheritance.Shape;

 class Rectangle extends Shape {
  private double width = 1.0;
  private double length = 1.0;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
   this.width = width;
   this.length = length;
  }

  public Rectangle(String color, boolean filled, double width, double length) {
   super(color, filled);
   this.width = width;
   this.length = length;
  }

  public double getWidth() {
   return width;
  }

  public void setWidth(double width) {
   this.width = width;
  }

  public double getLength() {
   return length;
  }

  public void setLength(double length) {
   this.length = length;
  }

  public double getArea() {
   return (width + length) * 2;
  }

  public double getPerimeter() {
   return width * length;
  }

  @Override
  public String toString() {
   return "Rectangle{" +
           "A rectangle with width=" + getWidth() +
           ", length=" + getLength() + " , which is a subclass of " + super.toString() +
           '}';
  }
 }
