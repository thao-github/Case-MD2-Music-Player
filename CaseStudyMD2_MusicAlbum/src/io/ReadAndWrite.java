package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite<T>{
    public List<T> readFile (String path) {
        try {
            File file = new File(path);
            if (!file.isFile()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(path);

            if (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (List<T>) objectInputStream.readObject();
            }
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeFile(String path, List<T> tList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
