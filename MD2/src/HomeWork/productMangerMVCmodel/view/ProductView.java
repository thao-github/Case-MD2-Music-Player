package HomeWork.productMangerMVCmodel.view;

import HomeWork.productMangerMVCmodel.controller.Controller;
import HomeWork.productMangerMVCmodel.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Controller controller = new Controller();
    List<Product> productList = controller.displayProduct();
    static Scanner sc = new Scanner(System.in);

    public void displayProduct() {
        for (int i = 0; i < productList.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                sc.nextLine();
            }
            System.out.print(productList.get(i));
        }
    }

    public void formAddNewProduct() {
        System.out.println("Enter product's name: ");
        String name = sc.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter description: ");
        String description = sc.nextLine();
        Product product = new Product(name, price, quantity, description);
        controller.addNewProduct(product);
    }

    public int formFindIndexById() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        return controller.findIndexById(id);
    }

    public void formUpdateProduct() {
        int index = formFindIndexById();
        System.out.println("Enter product's name: ");
        String name = sc.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter description: ");
        String description = sc.nextLine();

        controller.editProduct(index).setName(name);
        controller.editProduct(index).setQuantity(quantity);
        controller.editProduct(index).setPrice(price);
        controller.editProduct(index).setDescription(description);
    }

    public void formDeleteProduct() {
        int index = formFindIndexById();
        controller.deleteProductById(index);
    }

    public void sortProductByPrice() {
        controller.sortProductByPrice();
    }

    public void findTheHighestPriceProduct() {
        System.out.println(controller.findTheHighestPriceProduct());
    }
}
