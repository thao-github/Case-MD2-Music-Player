package HomeWork.Staff;

import java.util.Arrays;
import java.util.Scanner;

public class Control {
    public static void displayStaff(Staff[] array) {
        for (Staff a : array) {
            System.out.println(a.toString());
        }
    }

    public static Staff create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        Staff staff = new Staff(name, age, gender);
        return staff;
    }

    public static Staff[] addStaff(Staff[] staff) {
        Staff newStaff = create();
        Staff[] newArray = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length; i++) {
            newArray[i] = staff[i];
        }
        newArray[newArray.length - 1] = newStaff;
        return newArray;

    }


    public static Staff[] deleteStaff(Staff[] staff) {
        int index = findIndex(staff);

        if (index >= 0) {
            Staff[] newArray = new Staff[staff.length - 1];
            for (int i = 0; i < staff.length - 1; i++) {
                if (i < index) {
                    newArray[i] = staff[i];
                } else {
                    newArray[i] = staff[i + 1];
                }
            }
            return newArray;
        }
        return staff;
    }

    public static Staff[] editStaff(Staff[] staff) {
        Scanner scanner = new Scanner(System.in);
        int index = findIndex(staff);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        staff[index].setName(name);
        staff[index].setGender(gender);
        staff[index].setAge(age);
        return staff;

    }

    public static int findIndex(Staff[] staff) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        int idDel = scanner.nextInt();
//      int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < staff.length; i++) {
            if (idDel == staff[i].getId()) {
                return i;
            }
        }
        return -1;
    }

}
