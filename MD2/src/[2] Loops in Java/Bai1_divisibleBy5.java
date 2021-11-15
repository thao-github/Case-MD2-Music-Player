package src;
//Tìm số chia hết cho 5 tại vị trí thứ 20, bắt đầu từ 11
// tìm số chia hét cho 5 ở vị trí số 23 từ 0
public class Bai1_divisibleBy5 {
    public static void main(String[] args) {
        int count = 0;
        int number = 11;
        while (count < 20) {
            if (number % 5 == 0) {
                count++;
            }
            number++;
        }
        System.out.println(number - 1);
    }
}
