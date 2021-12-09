package BinaryFileSerialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile { //copy cac file

    private static void copyFile (File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }

    private void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while (true) {
            try {
                if (!((length = is.read(buffer)) > 0)) break;
                os.write(buffer, 0, length);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                is.close();
                os.close();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = in.nextLine();

        File sourceFile = new File (sourcePath);
        File destFile = new File(destPath);

        try {
            copyFile(sourceFile, destFile);
            System.out.println("Copy completed!");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file!");
            System.out.println(ioe.getMessage());
        }
    }
}
