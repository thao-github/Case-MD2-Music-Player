import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        System.out.println("Input USD: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println(usd + " equal to " + vnd);
    }
}
