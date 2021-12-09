package SearchingAlgorithm.stringSort;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Tìm chuỗi tăng dần có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}
