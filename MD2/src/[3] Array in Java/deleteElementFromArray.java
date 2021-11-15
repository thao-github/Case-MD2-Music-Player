import java.util.Arrays;
import java.util.Scanner;

public class deleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        System.out.println("The original array is: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to delete:");
        int number = scanner.nextInt();

        boolean isExist = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                System.out.println("The number you want to delete is at index: " + index);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("The number you want to delete is NOT in the array!");
        }


        int[] newArray = new int[arr.length- 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
            continue;
            }
            newArray[k++] = arr[i];
        }
            System.out.println("The new Array is: " + Arrays.toString(newArray));
        }
    }


