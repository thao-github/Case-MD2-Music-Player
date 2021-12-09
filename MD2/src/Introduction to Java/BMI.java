import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Input the weight (in kilogram): ");
        double weight = scanner.nextDouble();
        System.out.println("Input the height (in meter): ");
        double height = scanner.nextDouble();
        double bmi = weight / height * height;

        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
                }
            }
        }

