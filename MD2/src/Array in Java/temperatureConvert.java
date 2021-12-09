import java.util.Scanner;

public class temperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");


        System.out.println("Choose the option: ");
        int option = scanner.nextInt();
        double celsius;
        double fahrenheit;

        switch (option) {
            case 1:
                System.out.println("Enter Fahrenheit:");
                fahrenheit = scanner.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Enter Celsius:");
                celsius = scanner.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Enter choice between 0 and 2!");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        return fahrenheit;
    }
}
