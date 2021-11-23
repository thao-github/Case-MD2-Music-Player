package HomeWork.ProductManagement_ArrayList;

import java.util.*;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public Product create() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());
        Product newBook = new Product(name, price);
        return newBook;
    }

    // 1.
    public void addProduct() {
        productList.add(create());
    }

    // 2.
    public void editProduct() {
        int index = findIndexById();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());

        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
    }

    public int findIndexById() {
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    // 3.
    public void delete() {
        int index = findIndexById();
        productList.remove(index);
    }

    // 4.
    public void display() {
        System.out.println(productList.toString());
    }

    // 5.
    public void findByName() {

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }

    // 6.
    public void sortByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
    }
}

