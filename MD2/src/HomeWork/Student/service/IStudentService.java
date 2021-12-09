package HomeWork.Student.service;

import HomeWork.Student.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student) throws IOException;
}
