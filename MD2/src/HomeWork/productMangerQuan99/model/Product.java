package HomeWork.productMangerQuan99.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Product {
    private int id = 0;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private static int idNumber = 1;
    private LocalDate addDate;

    public Product() {
    }

    public Product(String name, double price, int quantity, String description) {
        this.id = idNumber++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.addDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public LocalDate getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return
                        id + "," +
                        name + "," +
                        price + "," +
                        quantity + "," +
                        description + "," +
                        addDate;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", quantity=" + quantity +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
