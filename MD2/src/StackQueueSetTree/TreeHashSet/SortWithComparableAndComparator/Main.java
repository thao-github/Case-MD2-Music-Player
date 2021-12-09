package StackQueueSetTree.TreeHashSet.SortWithComparableAndComparator;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Anh", 28, "Quảng Ninh"));
            students.add(new Student("Thảo", 19, "Tp Hồ Chí Minh"));
            students.add(new Student("Anh", 17, "Hà Nội"));
            students.add(new Student("Anh", 16, "Hà Nội"));

            NameAgeComparator nameAgeComparator = new NameAgeComparator();
            Collections.sort(students , nameAgeComparator);
            for (Student a: students) {
                System.out.println(a);
            }

        }
    }

