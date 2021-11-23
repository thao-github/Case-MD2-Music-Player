package HomeWork.ProductManagement_LinkedList;

import HomeWork.ProductManagement_ArrayList.ProductManager;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.println("1. Add product:");
            System.out.println("2. Edit product:");
            System.out.println("3. Delete product:");
            System.out.println("4. Display product:");
            System.out.println("5. Search product:");
            System.out.println("6. Sort product by price:");
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager1.addProduct();
                    System.out.println("Add Completed");
                    break;
                case 2:
                    ProductManager1.editProduct();
                    System.out.println("Edit Completed");
                    break;
                case 3:
                    ProductManager1.delete();
                    System.out.println("Delete Completed");
                    break;
                case 4:
                    ProductManager1.display();
                    break;
                case 5:
                    ProductManager1.searchByName();
                    break;
                case 6:
                    ProductManager1.sortByPrice();
                    System.out.println("Sort Completed");
                    break;
            }
        }
    }
}
