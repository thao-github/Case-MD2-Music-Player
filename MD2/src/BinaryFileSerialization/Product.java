package BinaryFileSerialization;

import java.io.*;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ObjectInputOutputStream{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product (1, "IP12", 28000,"new");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        ObjectInputStream ois = null;
        ois = new ObjectInputStream(new FileInputStream("product.txt"));
        try {
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
