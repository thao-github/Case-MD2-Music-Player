package ExceptionAndDebug;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        try {
            System.out.println("Enter a: ");
            a = sc.nextDouble();
            System.out.println("Enter b: ");
            b = sc.nextDouble();
            System.out.println("Enter c: ");
            c = sc.nextDouble();
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception("Exception: input sides is negative number!");
            }
            if (a + b < c || a + c < b || c + b < a) {
                throw new Exception("Exception: This is not side of an triangle!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
