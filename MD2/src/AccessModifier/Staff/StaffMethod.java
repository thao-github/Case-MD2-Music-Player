package AccessModifier.Staff;

import java.util.Scanner;

public class StaffMethod {
    public static void display(Staff[] staff) {
        for (Staff s : staff) {
            System.out.println(staff.toString());
        }
    }

    public static Staff[] addStaff(Staff[] staff) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();

        Staff staff1 = new Staff(name, age, gender);
        Staff[] newArray = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length; i++) {
            newArray[i] = staff[i];
        }
        newArray[staff.length + 1] = staff1;
        return newArray;
    }


//    public static Staff[] deleteStaff (Staff[] staff) {
//        Staff[] newArray2 = new Staff[staff.length -1];
//        for (int i = 0; i < staff.length; i++) {
//            newArray[2] = staff
//        }
//
//    }
}
