package StackQueueSetTree.TreeHashSet.SortWithComparableAndComparator;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int name = o1.getName().compareTo(o2.getName());
        if (o1.getName() == o2.getName()) {
            return o1.getAge() - o2.getAge();
        } else {
            return name;
        }
    }
}




