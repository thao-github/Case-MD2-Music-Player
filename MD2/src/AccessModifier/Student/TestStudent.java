package AccessModifier.Student;

public class TestStudent {
        public static void main(String[] args) {
            Student student = new Student();
            System.out.println(student.getName() + student.getClasses());
            student.setClasses("CO9");
            student.setName("Bill");
            System.out.println(student.getName() + student.getClasses());
        }
    }

