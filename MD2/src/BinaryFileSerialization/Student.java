package BinaryFileSerialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                id + "," + name + "," + address;
    }

    public static void writeToFile(String path, List<Student> students) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        fos.close();
    }

    public static List<Student> readDataFromFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            students = (List<Student>) ois.readObject();
            System.out.println(students);
            fis.close();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sting", "Pepsi"));
        students.add(new Student(2, "Tea+", "Suntory"));
        students.add(new Student(3, "Wakeup", "Cocacola"));
        writeToFile("St.txt", students);
        readDataFromFile("St.txt");
    }
}
