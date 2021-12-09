package src;

//Tong SNT tu 10 -> 50
public class Bai2_SumOfPrimeNumberBetween10and50 {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        while (number <= 50) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += number;
            }
            number++;
        }
        System.out.println(sum);
    }
}

