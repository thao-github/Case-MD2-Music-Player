package HomeWork.productMangerQuan99.service;


import HomeWork.productMangerQuan99.Controller.PriceComparator;
import HomeWork.productMangerQuan99.model.Product;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagementImpl implements IProductManagement {
    public static final String PRODUCT_LIST_TXT = "productList.txt";
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("Helmet", 500.0, 100, "New"));
        productList.add(new Product("Cap", 50.0, 200, "New"));
        productList.add(new Product("Cowboy Hat", 250.0, 300, "New"));
        productList.add(new Product("Conical Hats", 1000.0, 400, "New"));
        productList.add(new Product("Beanie", 200.0, 500, "New"));

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);

    }

    @Override
    public Product updateProduct(int index) {
        return productList.get(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteProduct(int id) {
        productList.remove(id);
    }

    @Override
    public void sortProduct() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(productList, priceComparator);

    }

    @Override
    public Product findTheHighestPriceProduct() {
        sortProduct();
        return productList.get(productList.size() - 1);
    }

//    @Override
//    public void readFile() {
//        FileReader fileReader;
//        try {
//            fileReader = new FileReader(PRODUCT_LIST_TXT);
//            BufferedReader br = new BufferedReader(fileReader);
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] productArray = line.split(",");
//                int id = Integer.parseInt(productArray[0]);
//                String name = productArray[0];
//                double price = Double.parseDouble(productArray[1]);
//                int quantity = Integer.parseInt(productArray[2]);
//                String description = productArray[3];
//               // Product newProduct = new Product(name, price, quantity, description);
//                //System.out.println(newProduct);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void writeDataToFile() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(PRODUCT_LIST_TXT);
            for (Product product : productList) {
                fileWriter.write(String.valueOf(product));
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
