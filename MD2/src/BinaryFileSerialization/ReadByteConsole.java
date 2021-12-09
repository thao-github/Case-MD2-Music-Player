package BinaryFileSerialization;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true) {
            System.out.println("Enter a character: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Finished!");
                break;
            }
            is.skip(2);// loại bỏ 2 kí tự \r(Enter) và \n(Xuong hang)
            System.out.println("The character is: " + (char) ch);
        }
    }
}
