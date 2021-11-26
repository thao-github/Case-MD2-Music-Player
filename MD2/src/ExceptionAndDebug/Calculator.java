package ExceptionAndDebug;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

            try {
                int sum = a + b;
                int minus = a - b;
                int multi = a * b;
                int divide = a / b;
                System.out.println(sum);
                System.out.println(minus);
                System.out.println(multi);
                System.out.println(divide);
            } catch (Exception e) {
                System.out.println("/by zero");
            }
        }
    }

