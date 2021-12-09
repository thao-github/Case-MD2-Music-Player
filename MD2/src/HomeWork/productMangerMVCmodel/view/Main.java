package HomeWork.productMangerMVCmodel.view;

import HomeWork.productManager.Controller;

import java.util.Scanner;

public class Main {
    public Main() {
        while (true) {
            System.out.println("-----ITEM-----");
            System.out.println("1. DISPLAY Product");
            System.out.println("2. ADD New Product");
            System.out.println("3. UPDATE Product");
            System.out.println("4. DELETE Product");
            System.out.println("5. SORT Product");
            System.out.println("6. SEARCH The Highest Price Product");
            System.out.println("Enter your CHOICE: ");

            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            ProductView productView = new ProductView();
            Controller controller = new Controller();
            switch (choice) {
                case 1:
                    productView.displayProduct();
                    break;
                case 2:
                    productView.formAddNewProduct();
                    System.out.println("Add New Product success!");
                    break;
                case 3:
                    productView.formUpdateProduct();
                    System.out.println("Update New Product success!");
                    break;
                case 4:
                    productView.formDeleteProduct();
                    System.out.println("Delete Product success!");
                    break;
                case 5:
                    productView.sortProductByPrice();
                    System.out.println("Sort Product success!");
                    break;
                case 6:
                    productView.findTheHighestPriceProduct();
                    break;
            }
        }
    }

    public static void main(String[] args) {
         new Main();
    }
}
