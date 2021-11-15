
public class display20FirstPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count <= 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(N + "\n");
            }
            N++;
        }
    }
}
