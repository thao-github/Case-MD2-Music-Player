package HomeWork.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManagement implements Management{
    ArrayList <Human> humanList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Student create() {

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter score");
        int score = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, age, score);
        return student;
    }

    @Override
    public void show() {
            System.out.println(humanList.toString());
        }

    @Override
    public void addHuman() {
        Student student = create();
        humanList.add(student);
    }

    @Override
    public void findHuman() {
        int index = findIndexById();
        System.out.println("The human is at: " + index );
    }

    public int findIndexById() {
        System.out.println("Enter id: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < humanList.size(); i++) {
            if (index == i) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeHuman() {

    }

    @Override
    public void sortStudentByAverageScore() {

    }

    @Override
    public void sumScore() {

    }
}
