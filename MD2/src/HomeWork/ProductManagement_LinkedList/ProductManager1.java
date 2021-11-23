package HomeWork.ProductManagement_LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager1 {
    static LinkedList<Product1> productList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static Product1 create() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());
        Product1 newBook = new Product1(name, price);
        return newBook;
    }

    //1
    public static void addProduct() {
        productList.addLast(create());
    }

    //2
    public static void editProduct() {
        int index = findIndexById();
        if (index >= 0) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter price:");
            double price = Double.parseDouble(scanner.nextLine());
            productList.get(index).setName(name);
            productList.get(index).setPrice(price);
        }
    }

    public static int findIndexById() {
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    //3
    public static void delete() {
        int index = findIndexById();
        if (index >= 0) {
            productList.remove(index);
        }
    }

    //4
    public static void display() {
        System.out.println(productList.toString());
    }

    //5
    public static void searchByName() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }

    //6
    public static void sortByPrice() {
        Collections.sort(productList, new Comparator<Product1>() {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
    }
}