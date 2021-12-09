package HomeWork.Student.config;

import HomeWork.Student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile {
    public void writeToFile (String path, List<Student> studentList) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            fos.close();
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFile(String path) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>)ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
