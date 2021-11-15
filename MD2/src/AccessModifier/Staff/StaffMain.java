package AccessModifier.Staff;
import java.util.Scanner;

public class StaffMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Staff[] staff = new Staff[3];
        staff[0] = new Staff("Nam", 25, "male");
        staff[1] = new Staff("Lan", 26, "female");
        staff[2] = new Staff("Anh", 27, "male");

        while (true) {
            System.out.println("1. Display Staff");
            System.out.println("2. Add Staff");
            System.out.println("3. Delete Staff");
            System.out.println("Enter the number you wanna do!");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    StaffMethod.display(staff);
                    break;
                case 2:
                    StaffMethod.addStaff(staff);
                    break;
            }
        }
    }



}


