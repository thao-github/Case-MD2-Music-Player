package ExceptionAndDebug;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tryCatch {
    //    public static void main(String[] args) {
//        int[] array = new int[100];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.floor(Math.random() * 1000));
//        }
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("Enter index: ");
//        Scanner sc = new Scanner(System.in);
//        int index = Integer.parseInt(sc.nextLine());
//
//        if (0 < index && index < 100) {
//            for (int i = 0; i < array.length; i++) {
//                if (index == i) {
//                    System.out.println("The value at index " + index + " is " + array[i]);
//                }
//            }
//        }
//
//        try {
//            System.out.println(array[index]);
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Invalid index!");
//        }
//    }
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        tryCatch arrExample = new tryCatch();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

}

