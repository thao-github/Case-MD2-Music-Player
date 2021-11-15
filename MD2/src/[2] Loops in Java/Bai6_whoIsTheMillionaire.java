package src;

import java.util.Scanner;

public class Bai6_whoIsTheMillionaire {
    public static void main(String[] args) {
        System.out.println("Who is the Millionaire:" +
                "How many girl students in C0921k1? \n" +
                "1. Only one \n" +
                "2. Two \n" +
                "3. Three \n" +
                "4. Four \n" +
                "Input number to guess. Good luck!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        switch (guess) {
            case 1:
            case 2:
            case 4:
                System.out.println("You guessed wrong :(");
                break;
            case 3:
                System.out.println("Congratulations! You guessed it right!");
                break;
            default:
                System.out.println("Guess a number between 1 and 4!");
        }
    }
}
