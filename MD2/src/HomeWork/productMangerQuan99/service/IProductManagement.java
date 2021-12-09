package HomeWork.productMangerQuan99.service;

import HomeWork.productMangerQuan99.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IProductManagement {
    List<Product> findAll();

    void save(Product product);

    Product updateProduct(int index);

    int findIndexById(int id);

    void deleteProduct(int index);

    void sortProduct();

    Product findTheHighestPriceProduct();

    //void readFile();

    void writeDataToFile();

}
