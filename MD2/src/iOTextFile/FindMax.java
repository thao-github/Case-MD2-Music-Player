package iOTextFile;
import java.io.*;
import java.util.Scanner;

public class FindMax {
    public void fileNumber() {
        try {
            FileWriter writer = new FileWriter("file findMax.txt");
            writer.write("30" + "\n");
            writer.write('5' + "\n");
            writer.write('7' + "\n");
            writer.write("90" + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int readFileText(String filePath) {
        int maxValue = 0;

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (maxValue < Integer.parseInt(line)) {
                    maxValue = Integer.parseInt(line);
                }
            }
            System.out.println("Check Max is in the result.txt ");
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("File does not exist or the content invalid");
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        FindMax findMax = new FindMax();
        findMax.fileNumber();

        int max = findMax.readFileText(path);
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("result.txt"));
            br.write("Max Value is: " + max);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
