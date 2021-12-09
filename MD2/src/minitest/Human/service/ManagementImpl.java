package minitest.Human.service;

import minitest.Human.model.Human;
import minitest.Human.model.Student;
import minitest.Human.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagementImpl implements IManagement{
    public static List<Human> humanList = new ArrayList<>();
    public static List<Student> studentList = new ArrayList<>();
    public static List<Teacher> teacherList = new ArrayList<>();
    private String HUMAN_PATH = "/Users/vuthao/Desktop/MD 2/MD2/src/minitest/Human/file/humanList.txt";
    static {
        humanList.add(new Human ("Human1", 20));
        humanList.add(new Human ("Human2", 20));
        humanList.add(new Human ("Human3", 20));
        humanList.add (new Student("Student1", 18,8.0));
        humanList.add (new Student("Student2", 18,9.0));
        humanList.add (new Teacher("Teacher1", 25,8000.0));
        humanList.add (new Teacher("Teacher2", 25,9000.0));
    }

    @Override
    public List<Human> readFile() throws IOException {
        try {
            FileInputStream fis = new FileInputStream(HUMAN_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            humanList = (List<Human>) ois.readObject();
            fis.close();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return humanList;
    }

    @Override
    public void writeFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(HUMAN_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(humanList);
        fos.close();
        oos.close();
    }

    @Override
    public void addHuman(Human human) {
        humanList.add(human);

    }

    @Override
    public int findIndexByName(String name) {
        for (int i = 0; i < humanList.size(); i++) {
            if (name.equals(humanList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editHuman(String name, Human human) {
        humanList.set(findIndexByName(name), human);
    }

    @Override
    public void deleteHuman(String name) {
        humanList.remove(findIndexByName(name));
    }
}
