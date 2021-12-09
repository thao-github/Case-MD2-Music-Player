package HomeWork.Student.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    StudentView studentView = new StudentView();
    public Main() throws IOException {
        System.out.println("Enter CHOICE:");
        System.out.println("1. DISPLAY Student List");
        System.out.println("2. ADD New Student To List");
        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                studentView.viewShowListStudent();
                break;
            }
            case 2: {
                studentView.viewAddNewStudent();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
