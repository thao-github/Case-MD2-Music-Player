package HomeWork.Staff;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Staff[] staff = new Staff[3];

        staff[0] = new Staff("Jame", 20, "Male");
        staff[1] = new Staff("Andy", 22, "Male");
        staff[2] = new Staff("Rose", 18, "Female");

        while (true) {
            System.out.println("1. Display staff");
            System.out.println("2. Add staff");
            System.out.println("3. Delete staff");
            System.out.println("4. Edit staff");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Control.displayStaff(staff);
                    break;
                case 2:
                    staff = Control.addStaff(staff);
                    break;
                case 3:
                    staff = Control.deleteStaff(staff);
                    break;
                case 4:
                    Control.editStaff(staff);
                    break;
            }
        }
    }
}