import java.util.Scanner;

public class displayPolygon {
    public static void main(String[] args) {
        System.out.println("1. Draw the rectangle.");
        System.out.println("2. Draw a square triangle.");
        System.out.println("3. Draw isosceles triangle.");
        System.out.println("0. Exit");
        System.out.println("Input your choice!");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Draw the rectangle.");
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 8; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;

            case 2:
                System.out.println("1. Draw the triangle.");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");


                for (int i = 5; i > 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");


                for (int i = 5; i > 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");


                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                break;

            case 3:


            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
        }
    }
}


