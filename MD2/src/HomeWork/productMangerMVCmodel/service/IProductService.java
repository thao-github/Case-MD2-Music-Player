package HomeWork.productMangerMVCmodel.service;

import HomeWork.productMangerMVCmodel.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    int findIndexById(int id);
    Product updateProduct(int index);
    void deleteProduct(int index);
    void sortProduct();
    Product searchTheHighestPriceProduct();

}
