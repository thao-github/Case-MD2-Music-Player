package BinaryFileSerialization;

import java.io.*;
import java.util.List;

public class ProductManage implements Serializable {
    private String productCode;
    private String name;
    private String manufacture;
    private double price;
    private String description;

    public ProductManage() {
    }

    public ProductManage(String productCode, String name, String manufacture, double price, String description) {
        this.productCode = productCode;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductManage{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static void writeToFile(String path, List<Product> list) throws IOException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);

    }
    public static void main(String[] args) {

    }
}
