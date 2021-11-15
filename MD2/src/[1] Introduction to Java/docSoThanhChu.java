//import java.util.Scanner;
//public class docSoThanhChu {
//    public static void main(String[] args) {
//        String number1 = "1";
//        int number2 = 12;
//        System.out.println(number1 + number2);
//
//        // String[] arr = str.split("");
//        // đây là đối tượng để nhận giá trị truyền vào từ bàn phím.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input any number :");
//        int number = scanner.nextInt();
//
//        if (number >= 10) {
//            while (number >= 10) {
//                show(number % 10);
//                number = number / 10;
//            }
//            show(1);
//        }else {
//            show(number);
//        }
//    }
//
//    public static void show(int number) {
//        switch (number) {
//            case 0:
//                System.out.print("không ");
//                break;
//            case 1:
//                System.out.print("một ");
//                break;
//            case 2:
//                System.out.print("hai ");
//                break;
//            case 3:
//                System.out.print("ba ");
//                break;
//            case 4:
//                System.out.print("bốn ");
//                break;
//            case 5:
//                System.out.print("năm ");
//                break;
//            case 6:
//                System.out.print("sáu ");
//                break;
//            case 7:
//                System.out.print("bảy ");
//                break;
//            case 8:
//                System.out.print("tám ");
//                break;
//            case 9:
//                System.out.print("chín ");
//                break;
//        }
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = scanner.nextInt();
        String[] temp = Integer.toString(num).split("");
        System.out.println(Arrays.toString(temp));//xác nhận biến thành mảng
        for (String a : temp) {
            number(a);
        }
    }

    public static void number(String num) {
        switch (num) {
            case "1":
                System.out.print("Một ");
                break;
            case "2":
                System.out.print("Hai ");
                break;
            case "3":
                System.out.print("Ba ");
                break;
            case "4":
                System.out.print("Bốn ");
                break;
            case "5":
                System.out.print("Năm ");
                break;
            case "6":
                System.out.print("Sáu ");
                break;
            case "7":
                System.out.print("Bảy ");
                break;
            case "8":
                System.out.print("Tám ");
                break;
            case "9":
                System.out.print("Chín ");
                break;
            case "0":
                System.out.println("Không ");
                break;
        }
    }
}

