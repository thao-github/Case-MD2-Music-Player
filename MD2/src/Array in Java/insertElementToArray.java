import java.util.Arrays;
import java.util.Scanner;

public class insertElementToArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        System.out.println("The original array is: " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to insert:");
        int number = input.nextInt();
        System.out.println("Enter the index you want to insert: ");
        int index = input.nextInt();

        if(index <= -1 || index > arr.length) {
            System.out.println("Can not insert the Element");
        }

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
                newArray[index+1] = number;
        }
        System.out.println ("The new Array is:" + Arrays.toString(newArray));

        }
    }

