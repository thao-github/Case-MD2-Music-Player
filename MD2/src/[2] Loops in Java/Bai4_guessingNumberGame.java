package src;

import java.util.Scanner;

public class Bai4_guessingNumberGame {
    public static void main(String[] args) {
        System.out.println(
                "A number is chosen between 1 and 10. Guess the number until you guess it right!");
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);
        for (int i = 0; i <= 10; i++) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber) {
                System.out.println("Congratulation!! You guessed it right");
                break;
            } else if (inputNumber < randomNumber) {
                System.out.println("Oops sorry!!Try a larger number!");
            } else {
                System.out.println("Oops sorry!!Try a smaller number!");
            }
        }
    }
}
