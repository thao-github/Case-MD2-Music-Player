package HomeWork.Student.view;

import HomeWork.Student.controller.StudentController;
import HomeWork.Student.model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showStudentList();
    static Scanner sc = new Scanner(System.in);

    public void viewShowListStudent(){
        System.out.println(studentController.showStudentList());
    }

    public void viewAddNewStudent() throws IOException {
        int id;
        if (studentList.size() == 0) {
            id = 1;
        } else {
            id = studentList.get(studentList.size() - 1).getId() + 1;
        }
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        Student student = new Student(id, name, age);
        studentController.addNewStudent(student);
    }
}
