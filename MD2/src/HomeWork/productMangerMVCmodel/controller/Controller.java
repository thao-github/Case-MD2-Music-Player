package HomeWork.productMangerMVCmodel.controller;
import HomeWork.productMangerMVCmodel.model.Product;
import HomeWork.productMangerMVCmodel.service.ProductServiceImpl;

import java.util.List;

public class Controller {
    ProductServiceImpl productServiceImpl = new ProductServiceImpl ();
    public List<Product> displayProduct() {
        return productServiceImpl.findAll();
    }

    public void addNewProduct(Product product ) {
        productServiceImpl.save(product);
    }

    public int findIndexById(int id){
        return productServiceImpl.findIndexById(id);
    }
    public Product editProduct(int index){
        return productServiceImpl.updateProduct(index);
    }

    public void deleteProductById(int index) {
         productServiceImpl.deleteProduct(index);
    }

    public void sortProductByPrice() {
        productServiceImpl.sortProduct();
    }

    public Product findTheHighestPriceProduct() {
        return productServiceImpl.searchTheHighestPriceProduct();
    }




}
