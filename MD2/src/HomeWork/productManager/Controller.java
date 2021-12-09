package HomeWork.productManager;

import HomeWork.Employee.PriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("TL1124", "T-shirt", 95.0, 100, "free size"));
        productList.add(new Product("HD1124", "Hoodies", 165.0, 100, "free size"));
        productList.add(new Product("PL1124", "Polo", 125.0, 100, "free size"));
        productList.add(new Product("CR1124", "Crop top", 95.0, 100, "free size"));
        productList.add(new Product("OC1124", "Overcoat", 95.0, 100, "free size"));
        productList.add(new Product("JS1124", "Jeans", 255.0, 100, "free size"));
    }

    //1
    public static void displayProduct() {
        for (int i = 0; i < productList.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                sc.nextLine();
            }
            System.out.print(productList.get(i));
        }
    }

    //2
    public static void addNewProduct() {
        productList.add(create());
    }

    public static Product create() {
        System.out.println("Enter product Code: ");
        String productCode = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter price: ");
        double price;
        while (true) {
            try {
                price = Double.parseDouble(sc.nextLine());
                if (price >= 0 && price < Double.MAX_VALUE) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid value.Try to enter a double value");
            }
        }

        System.out.println("Enter quantity: ");
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(sc.nextLine());
                ;
                if (quantity >= 0 && quantity < Integer.MAX_VALUE) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid value.Try to enter an integer value");
            }
        }
        System.out.println("Enter description: ");
        String description = sc.nextLine();
        return new Product(productCode, name, price, quantity, description);
    }

    //3
    public static void updateProduct() {
        System.out.println("Enter product Code:");
        String productCode = sc.nextLine();
        boolean check = true;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productCode.equals(productList.get(i).getProductCode())) {
                check = true;
                index = i;
                break;
            } else {
                check = false;
            }
        }

        if (check) {
            productList.remove(productList.get(index));
            addNewProduct();
        } else {
            System.out.println(" The product could not be found." + "\n" +
                    "Press 1 to enter another product Code or" + "\n" +
                    "Press 2 to back to the Menu!");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    updateProduct();
                    break;
                case 2:
                    Main.Menu();
                    break;
            }
        }
    }

    //4
    public static void deleteProduct() {
        System.out.println("Enter the product Code to delete: ");
        String productCode = sc.nextLine();
        boolean check = true;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productCode.equals(productList.get(i).getProductCode())) {
                check = true;
                index = i;
                break;
            } else {
                check = false;
            }
        }

        if (check) {
            System.out.println("Are you sure to delete this " + productCode + " product? " + "\n" +
                    "Press Y to confirm. ");
            String y = sc.nextLine();
            if (y.equalsIgnoreCase("Y")) {
                productList.remove(index);
            }
            return;

        } else {

            System.out.println("The product Code could not be found!" + "\n" +
                    "Press 1 to enter another product Code or" + "\n" +
                    "Press 2 to back to the Menu!");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    deleteProduct();
                    System.out.println("Are you sure to delete this " + productCode + " product? " + "\n" +
                            "Press Y to confirm. ");
                    String y = sc.nextLine();
                    if (y.equalsIgnoreCase("Y")) {
                        productList.remove(index);
                    } else {
                        Main.Menu();
                    }
                    break;
                case 2:
                    Main.Menu();
            }
        }
    }

    //5
    public static void sortProductByPrice() {
        System.out.println("Sort the Products by Price increasingly ---> ");
        Collections.sort(productList, new PriceComparator());
        System.out.println("Product sorted by Price success!" + "\n" +
                "Press 1 or 2 to display the product list after sorting or" + "\n" +
                "Press 3 to back to the Menu.");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1 || choice == 2) {
            displayProduct();
        } else if (choice == 3) {
            Main.Menu();
        }
    }

    //6
    public static void findTheHighestPriceProduct() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
        System.out.println(productList.get(productList.size() - 1));
    }
}




