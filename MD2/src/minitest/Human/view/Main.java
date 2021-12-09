package minitest.Human.view;

import minitest.Human.model.Human;
import minitest.Human.model.Student;
import minitest.Human.model.Teacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() throws IOException {
        while (true) {
            System.out.println("---MENU---");
            System.out.println("1. Read & Write File");
            System.out.println("2. Add a person + Save");
            System.out.println("3. Edit person + Save");
            System.out.println("4. Delete person + Save");


            System.out.println("Enter CHOICE!");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());

            HumanView humanView = new HumanView();
            List<Human> humanList = humanView.readFile();

            switch (choice) {
                case 1: {
                    humanView.writeFile();
//                    for (Human human: humanList) {
//                        System.out.println(human);
//                    }
                    for (int i = 0; i < humanList.size(); i++) {
                        if(humanList.get(i) instanceof Student) {
                            System.out.println(humanList.get(i));
                        }
                    }
                    for (int i = 0; i < humanList.size(); i++) {
                        if(humanList.get(i) instanceof Teacher) {
                            System.out.println(humanList.get(i));
                        }
                    }
                    break;
                }
                case 2: {
                    humanView.addHuman();
                    humanView.writeFile();
                    break;
                }
                case 3: {
                    humanView.editHuman();
                    humanView.writeFile();
                }
                case 4: {
                    humanView.deleteHuman();
                    humanView.writeFile();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
