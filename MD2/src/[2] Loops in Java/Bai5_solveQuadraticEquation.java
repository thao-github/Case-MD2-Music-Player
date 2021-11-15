package src;

import java.util.Scanner;

public class Bai5_solveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        double a = scanner.nextDouble();
        System.out.println("Input b:");
        double b = scanner.nextDouble();
        System.out.println("Input c:");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        double x, x1, x2;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("This quadratic Equation has two roots is: " + x1 + " and " + x2);
        } else if (delta == 0) {
            x = -b / 2 * a;
            System.out.println("This quadratic Equation has one root is: " + x);
        } else {
            System.out.println("There is no solution to this quadratic Equation");
        }
    }
}
