package StackQueue.TreeHashSet.SortWithComparableAndComparator;
import java.util.Comparator;


public class Student {
        String name;
        Integer age;
        String address;


        public Student(String name, Integer age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
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

        static class NameCompare implements Comparator<Student> {

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

//    static class AgeCompare implements Comparator<Student> {
//
//        @Override
//        public int compare(Student o1, Student o2) {
//            return o1.getAge().compareTo(o2.getAge());
//        }
//    }

//    @Override
//    public int compareTo(Student o) {
//        int name = this.getName().compareTo(o.getName());
//        if (name == 0) {
//            return this.getAge() - o.getAge();
//        } else {
//            return name;
//        }
//    }
    }


