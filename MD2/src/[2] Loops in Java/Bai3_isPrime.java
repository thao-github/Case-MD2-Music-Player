package src;

import java.util.Scanner;

public class Bai3_isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number < 2) {
            System.out.println(number + " is NOT a Prime Number");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is NOT a Prime Number");
            }
        }

    }
}
