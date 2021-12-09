import java.util.Scanner;

public class drawMenuForApp {
    public static void main(String[] args) {
        System.out.println("1. Draw the triangle.");
        System.out.println("2. Draw a square.");
        System.out.println("3. Draw the rectangle.");
        System.out.println("0. Exit");
        System.out.println("Input your choice!");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Draw the triangle.");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("2. Draw a square.");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("3. Draw the rectangle.");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
        }

    }
}
