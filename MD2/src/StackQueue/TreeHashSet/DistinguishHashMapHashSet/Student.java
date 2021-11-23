package StackQueue.TreeHashSet.DistinguishHashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 18, "HCM");
        Student student2 = new Student("A", 18, "HCM");
        Student student3 = new Student("C", 18, "HCM");

        HashMap<Integer, Student> hashMap = new HashMap<>();
        System.out.println("HashMap: ");
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(1, student3);
        System.out.println(hashMap + "\n");

        System.out.println("HashSet: ");
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student1);
        hashSet.add(student3);
        System.out.println(hashSet);
    }
}
