package HomeWork.Student.service;

import HomeWork.Student.config.ConfigReadAndWriteFile;
import HomeWork.Student.model.Student;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
    public String PATH_STUDENT = "/Users/vuthao/Desktop/MD 2/MD2/src/HomeWork/Student/file/student.txt";
    ConfigReadAndWriteFile cf = new ConfigReadAndWriteFile();
    List<Student> studentList = cf.readFile(PATH_STUDENT);

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student)  {
        try {
            cf.writeToFile(PATH_STUDENT, studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentList.add(student);
    }
}
