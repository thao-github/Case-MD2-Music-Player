package BinaryFileSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample2 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        byte[] bytes = new byte[] {'N', 'o', 'n', 'g', 'N','a','n', 'H','a','N','o','i'};
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();
    }
}
