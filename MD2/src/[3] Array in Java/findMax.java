import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the array size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter the element " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Billionaire Property List: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("\n" + "The MAX in the array is " + max + " at the position " + index + " in the array.");
    }
}
