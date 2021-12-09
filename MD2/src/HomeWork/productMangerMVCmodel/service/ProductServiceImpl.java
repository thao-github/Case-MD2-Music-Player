package HomeWork.productMangerMVCmodel.service;

import HomeWork.productMangerMVCmodel.controller.PriceComparator;
import HomeWork.productMangerMVCmodel.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    static List<Product> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static{
        productList.add(new Product("T-shirt", 95.0, 100, "free size"));
        productList.add(new Product("Hoodies", 165.0, 100, "free size"));
        productList.add(new Product( "Polo", 125.0, 100, "free size"));
        productList.add(new Product("Crop top", 95.0, 100, "free size"));
        productList.add(new Product("Overcoat", 95.0, 100, "free size"));
        productList.add(new Product("Jeans", 255.0, 100, "free size"));
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
    public int findIndexById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Product updateProduct(int index) {
        return productList.get(index);
    }


    @Override
    public void deleteProduct(int index) {
        productList.remove(index);

    }

    @Override
    public void sortProduct() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(productList, priceComparator);

    }

    @Override
    public Product searchTheHighestPriceProduct() {
        sortProduct();
        return productList.get(productList.size() - 1);
    }
}
