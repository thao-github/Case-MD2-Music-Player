import java.util.Scanner;
public class findMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array is: ");
        for (int k : arr) {
            System.out.print(k + "\t");
        }

        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("\n" + "The min value is: " +min);
    }
}
