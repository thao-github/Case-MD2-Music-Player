package iOTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private Integer id = 0;
    private String abb;
    private String countryName;
    private static Integer idNumber = 1;

    public Country() {
    }

    public Country(String abb, String countryName) {
        this.id = idNumber++;
        this.abb = abb;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbb() {
        return abb;
    }

    public void setAbb(String abb) {
        this.abb = abb;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return
                id + "," +
                        abb + "," +
                        countryName + "," + "\n";
    }

    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        list.add(new Country("AU", "Australia"));
        list.add(new Country("CN", "China"));
        list.add(new Country("AU", "Australia"));
        list.add(new Country("CN", "China"));
        list.add(new Country("JP", "Japan"));
        list.add(new Country("CN", "China"));
        list.add(new Country("JP", "Japan"));
        list.add(new Country("TL", "Thailand"));

        System.out.println("Enter path:");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Country country = new Country();
        country.fileWriter(list);
        country.readFile(path);

    }

    public void fileWriter(List<Country> list) {
        FileWriter fileWriter;
        {
            try {
                fileWriter = new FileWriter("CountryList.txt");
                for (int i = 0; i < list.size(); i++) {
                    fileWriter.write(String.valueOf(list.get(i)));
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
