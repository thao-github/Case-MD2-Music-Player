package HomeWork.Employee;

import java.util.Scanner;

public class MainEmployee {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Manager", "0909 999 999", "HCMC");
        employee[1] = new Employee("Staff", "0909 999 666", "HCMC");
        employee[2] = new Employee("Accountant", "0909 999 333", "HCMC");

        while (true) {
            System.out.println("Employee Management");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee ");
            System.out.println("3. Display Employee");
            System.out.println("4. Edit Employee");
            System.out.println("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employee = Controller.addEmployee(employee);
                    break;
                case 2:
                    employee = Controller.deleteEmployee(employee);
                    break;
                case 3:
                    Controller.displayEmployee(employee);
                    break;
                case 4:
                    Controller.editEmployee(employee);
                    break;
            }
        }
    }
}
