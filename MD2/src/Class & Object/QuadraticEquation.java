import java.util.Scanner;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return  b * b - 4 * a * c;
    }
    public double getRoot() {
        return -b / (2 * a);
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/ (2 * a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double d = quadraticEquation.getDiscriminant();
        double r = quadraticEquation.getRoot();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();

        if ( d > 0) {
            System.out.println (r1 + " and " + r2);
        } else if (d == 0) {
            System.out.println(r);
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
