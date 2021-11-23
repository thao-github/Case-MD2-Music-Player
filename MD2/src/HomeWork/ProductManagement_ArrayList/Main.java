package HomeWork.ProductManagement_ArrayList;
import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);

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
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productManager.addProduct();
                        System.out.println("Add Completed");
                        break;
                    case 2:
                        productManager.editProduct();
                        System.out.println("Edit Completed");
                        break;
                    case 3:
                        productManager.delete();
                        System.out.println("Delete Completed");
                        break;
                    case 4:
                        productManager.display();
                        break;
                    case 5:
                        productManager.findByName();
                        break;
                    case 6:
                        productManager.sortByPrice();
                        System.out.println("Sort Completed");
                        break;
                }
            }
        }
    }

