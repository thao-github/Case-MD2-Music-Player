import java.util.Scanner;
public class countStudentPassTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int size = scanner.nextInt();

        do {
            if (size > 30) {
                System.out.println("The number should not exceed 30!");
            }
        } while (size > 30);

        int [] students = new int[size];
        for (int i = 0; i< students.length; i++) {
            System.out.println("Enter the mark for students " + (i + 1) + ": ");
            students[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] >= 5) {
                count++;
            }
        }
        System.out.println("The number of students passed the exam is: " +count);
    }
}
