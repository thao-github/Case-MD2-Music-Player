package HomeWork.productMangerQuan99.Controller;

import HomeWork.productMangerQuan99.model.Product;
import HomeWork.productMangerQuan99.service.ProductManagementImpl;

import java.util.List;

public class Controller {
    public static ProductManagementImpl productManagementImpl = new ProductManagementImpl();

    public List<Product> displayProduct(){
        return productManagementImpl.findAll();
    }

    public void addNewProduct(Product product){
        productManagementImpl.save(product);
    }

    public Product updateProduct(int index) {
       return productManagementImpl.updateProduct(index);
    }

    public int findIndexById(int id) {
        return productManagementImpl.findIndexById(id);
    }

    public void removeProduct(int id) {
        productManagementImpl.deleteProduct(id);
    }

    public void sortProduct(){
        productManagementImpl.sortProduct();
    }

    public Product findTheHighestPriceProduct(){
        return productManagementImpl.findTheHighestPriceProduct();
    }

//    public void readFile(){
//        productManagementImpl.readFile();
//    }

    public void writeDataToFile() {
        productManagementImpl.writeDataToFile();
    }
}
