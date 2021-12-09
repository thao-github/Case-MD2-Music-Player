package HomeWork.Student.controller;

import HomeWork.Student.model.Student;
import HomeWork.Student.service.StudentServiceImpl;


import java.util.List;

public class StudentController {
    StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

    public List<Student> showStudentList(){
        return studentServiceImpl.findAll();
    }

    public void addNewStudent (Student student) {
        studentServiceImpl.save(student);
    }
}
