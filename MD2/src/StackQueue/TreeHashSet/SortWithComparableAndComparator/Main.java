package StackQueue.TreeHashSet.SortWithComparableAndComparator;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Anh", 28, "Quảng Ninh"));
            students.add(new Student("Thảo", 19, "Tp Hồ Chí Minh"));
            students.add(new Student("Anh", 17, "Hà Nội"));
            students.add(new Student("Anh", 16, "Hà Nội"));


//        Student.AgeCompare ageCompare = new Student.AgeCompare();
//        Collections.sort(students, ageCompare);
            Student.NameCompare nameCompare = new Student.NameCompare();
            Collections.sort(students ,nameCompare);


//        Collections.sort(students);
            for (Student a: students) {
                System.out.println(a);
            }

        }
    }

