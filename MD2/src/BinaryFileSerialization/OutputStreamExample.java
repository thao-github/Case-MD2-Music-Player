package BinaryFileSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream= new FileOutputStream("Student.txt");
        outputStream.write('I');
        outputStream.write('U');
        outputStream.close();
    }
}
