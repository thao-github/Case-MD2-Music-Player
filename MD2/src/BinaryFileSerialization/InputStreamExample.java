package BinaryFileSerialization;

import java.io.*;

public class InputStreamExample { //doc lan luot cac byte (8 bit)
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("CodeGym.txt");
        int i = -1;
        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
        is.close();
    }
}
