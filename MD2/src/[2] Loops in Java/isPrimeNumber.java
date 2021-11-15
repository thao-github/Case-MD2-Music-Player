import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Input an integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is NOT a Prime Number");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is NOT a Prime Number");
            }
        }
    }
}
