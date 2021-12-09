import java.util.Scanner;

public class theGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first integer:");
        int a = scanner.nextInt();
        System.out.println("Input the second integer:");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor!");
        } else if (a == 0) {
            System.out.println("The greatest common factor is : " + Math.abs(b));
        } else if (b == 0) {
            System.out.println("The greatest common factor is : " + Math.abs(a));
        } else {
            while (b != a) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("The greatest common factor is : " + a);
        }

    }
}

