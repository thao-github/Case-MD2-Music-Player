package iOTextFile;

import java.io.*;
import java.util.Scanner;

public class SumNumberInTextFile {
    public static void main(String[] args) {

        FileWriter writer;
        try {
            writer = new FileWriter("file numbers.txt");
            writer.write('3' + "\n");
            writer.write('5' + "\n");
            writer.write('7' + "\n");
            writer.write('a' + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Enter the file Path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        SumNumberInTextFile sumNumberInTextFile = new SumNumberInTextFile();
        sumNumberInTextFile.readFileText();
    }

    public void readFileText() {
        try {
            File file = new File("/Users/vuthao/Desktop/MD 2/file numbers.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader("file numbers.txt"));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);

        } catch (Exception e) {
            System.out.println("File does not exist or the content does not exist!");
        }
    }
}

