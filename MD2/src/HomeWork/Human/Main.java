package HomeWork.Human;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Display Human");
        System.out.println("2. Add Human");
        System.out.println("3. Find Human");
        System.out.println("4. Remove Human");
        System.out.println("5. Edit Human");
        System.out.println("6. Sort Students");
        System.out.println("7. Sum Score");

        HumanManagement humanManagement = new HumanManagement();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    humanManagement.show();
                    break;
                case 2:
                    humanManagement.addHuman();
                    break;
                case 3:
                    humanManagement.findHuman();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }


    }

}
