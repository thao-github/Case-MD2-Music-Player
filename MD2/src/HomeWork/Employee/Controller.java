package HomeWork.Employee;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    //1 Add
    public static Employee[] addEmployee(Employee[] employee) {
        Employee newEmployee = create();
        Employee[] newEmployeeArr = new Employee[employee.length + 1];
        for (int i = 0; i < employee.length; i++) {
            newEmployeeArr[i] = employee[i];
        }
        newEmployeeArr[employee.length] = newEmployee;
        return newEmployeeArr;
    }

    public static Employee create() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Employee employee = new Employee(name, phoneNumber, address);
        return employee;
    }

    //2
    public static Employee[] deleteEmployee(Employee[] employee) {
        int index = findIndexById(employee);
        Employee[] newEmployeeArr = new Employee[employee.length - 1];
        for (int i = 0; i < employee.length - 1; i++) {
            if (i < index) {
                newEmployeeArr[i] = employee[i];
            } else {
                newEmployeeArr[i] = employee[i + 1];
            }
        }
        return newEmployeeArr;
    }

    //3
    public static Employee[] displayEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        return employee;
    }

    //4
    public static Employee[] editEmployee(Employee[] employee) {
        int index = findIndexById(employee);
        System.out.println("Enter name:");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Enter address: ");
        String newAddress = scanner.nextLine();
        for (int i = 0; i < employee.length; i++) {
            if (index == i) {
                employee[i].setName(newName);
                employee[i].setPhoneNumber(newPhoneNumber);
                employee[i].setAddress(newAddress);
            }
        }
        return employee;
    }

    public static int findIndexById(Employee[] employee) {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employee.length; i++) {
            if (id == i) {
                return i;
            }
        }
        return -1;
    }
}
