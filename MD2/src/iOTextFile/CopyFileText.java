package iOTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public void sourceFile() {
        try {
            FileWriter writer = new FileWriter("sourceFile.txt");
            writer.write("The" + "\n");
            writer.write("Sweetie");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readSourceFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = null;
            List<String> fileContent = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                fileContent.add(line);
            }

            FileWriter writer = new FileWriter("targetFile.txt");
            for (int i = 0; i < fileContent.size(); i++) {
                writer.write(fileContent.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String path = sc.nextLine();

        CopyFileText main = new CopyFileText();
        main.sourceFile();
        main.readSourceFile(path);

    }

}
