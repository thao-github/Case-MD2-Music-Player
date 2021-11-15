import java.util.Scanner;
public class timGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String studentName = scanner.nextLine();
        String [] students = {"Family", "Health","Beauty", "Money", "Love", "Freedom"};

        boolean findOut = false;
        for(int i = 0; i <= students.length; i++) {
            if (students[i].equals (studentName)) {
                findOut = true;
                System.out.println(studentName + " is in the array at the position of " +i);
                break;
            }
        }
        if (!findOut) {
            System.out.println(studentName + " is NOT in the list! ");
        }
    }
}
