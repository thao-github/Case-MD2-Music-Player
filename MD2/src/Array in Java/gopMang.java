import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size1 of the arr1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i< arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size1 of the arr2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

       for (int i = 0; i< arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }

        int size3 = size1 + size2;
        int[] arr3 = new int [size3];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }
        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i] +"\t");
        }
    }
}


