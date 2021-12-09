import java.util.Scanner;

public class interestCalculate {
    public static void main(String[] args) {
        System.out.println("Input the amount of money: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("Input the interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.println("Input the number of months: ");
        int month = scanner.nextInt();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("The total Interest is: " + totalInterest);
    }
}