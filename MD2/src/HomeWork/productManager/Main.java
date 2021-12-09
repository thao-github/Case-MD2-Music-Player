package HomeWork.productManager;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void Menu() {
        while (true) {
            System.out.println("------ITEM------");
            System.out.println("1. Display Product");
            System.out.println("2. Add New Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Sort Product");
            System.out.println("6. Search the highest price Product");
            System.out.println("7. Read Product");
            System.out.println("8. Record Product");
            System.out.println("9. Exit");

            System.out.println("ENTER YOUR CHOICE: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Controller.displayProduct();
                    break;
                case 2:
                    Controller.addNewProduct();
                    System.out.println("Product added success!");
                    break;
                case 3:
                    Controller.updateProduct();
                    System.out.println("Product updated success!");
                    break;
                case 4:
                    Controller.deleteProduct();
                    System.out.println("Product deleted success!");
                    break;
                case 5:
                    Controller.sortProductByPrice();
                    break;
                case 6:
                    Controller.findTheHighestPriceProduct();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
