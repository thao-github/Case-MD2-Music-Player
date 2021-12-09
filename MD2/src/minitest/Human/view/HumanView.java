package minitest.Human.view;

import minitest.Human.controller.HumanController;
import minitest.Human.model.Human;
import minitest.Human.model.Student;
import minitest.Human.model.Teacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class HumanView {
    HumanController humanController = new HumanController();
    static Scanner sc = new Scanner(System.in);

    public List<Human> readFile() throws IOException {
        return humanController.readFile();
    }

    public void writeFile() throws IOException {
        humanController.writeFile();
    }

    //2
    public void addHuman() {
        System.out.println("Enter 1 to add Student" + "\n" + "Enter 2 to add Teacher");
        Scanner sc = new Scanner(System.in);
        int chooseToAdd = Integer.parseInt(sc.nextLine());
        switch (chooseToAdd) {
            case 1: {
                humanController.addHuman(createStudent());
                break;
            }
            case 2: {
                humanController.addHuman(createTeacher());
                break;
            }
        }
    }

    public Human createStudent() {
        System.out.println("1. Add New Student");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter average Score: ");
        double averageScore = Double.parseDouble(sc.nextLine());
        Human student = new Student(name, age, averageScore);
        return student;
    }

    public Human createTeacher() {
        System.out.println("1. Add New Teacher");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        Human teacher = new Teacher(name, age, salary);
        return teacher;
    }

    //3
    public void editHuman(){
        System.out.println("Enter name that you want to edit:");
        String name = sc.nextLine();
        System.out.println("Enter 1 to edit Student" + "\n" + "Enter 2 to edit Teacher");
        int chooseToEdit = Integer.parseInt(sc.nextLine());
        switch (chooseToEdit) {
            case 1: {
                humanController.editHuman(name, createStudent());
                break;
            }
            case 2: {
                humanController.editHuman(name, createTeacher());
                break;
            }
        }
    }

    //4
    public void deleteHuman(){
        System.out.println("Enter name you want to delete:");
        String name = sc.nextLine();
        humanController.deleteHuman(name);
    }
}



