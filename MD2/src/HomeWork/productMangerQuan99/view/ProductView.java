package HomeWork.productMangerQuan99.view;

import HomeWork.productMangerQuan99.Controller.Controller;
import HomeWork.productMangerQuan99.model.Product;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static Controller controller = new Controller();
    List<Product> productList = controller.displayProduct();
    static Scanner sc = new Scanner(System.in);

    //1
    public List<Product> formDisplayProduct() {
        for (int i = 0; i < productList.size(); i++) {
            if (i != 0 && i % 3 == 0) {
                sc.nextLine();
            }
            System.out.println(productList.get(i));
        }
        return productList;
    }

    //2
    public void formAddProduct() {
        controller.addNewProduct(createNewProduct());
    }

    public Product createNewProduct() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter quantity: ");
        int quantity;
        quantity = isValidQuantity();

        System.out.println("Enter price: ");
        double price;
        price = isValidPrice();

        System.out.println("Enter description: ");
        String description = sc.nextLine();
        Product product;
        product = new Product(name, price, quantity, description);
        return product;
    }

    private double isValidPrice() {
        double price;
        while (true) {
            try {
                price = Double.parseDouble(sc.nextLine());
                if (price > 0 && price < Double.MAX_VALUE) break;
            } catch (Exception e) {
                System.out.println("Enter Double!");
            }
        }
        return price;
    }

    private int isValidQuantity() {
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(sc.nextLine());
                if (quantity > 0 && quantity < Integer.MAX_VALUE) break;
            } catch (Exception e) {
                System.out.println("Enter Integer!");
            }
        }
        return quantity;
    }

    //3
    public void formUpdateProduct() {
        int index = findIndexById();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter price: ");
        double price = isValidPrice();
        System.out.println("Enter quantity: ");
        int quantity = isValidQuantity();
        System.out.println("Enter description: ");
        String description = sc.nextLine();

        controller.updateProduct(index).setName(name);
        controller.updateProduct(index).setPrice(price);
        controller.updateProduct(index).setQuantity(quantity);
        controller.updateProduct(index).setDescription(description);
    }

    public int findIndexById() {
        System.out.println("Enter id: ");
        int id;
        id = Integer.parseInt(sc.nextLine());
        return controller.findIndexById(id);
    }

    public void deleteProduct() {
        controller.removeProduct(findIndexById());
    }

    public void sortProduct() {
        controller.sortProduct();
    }

    public void findTheHighestPriceProduct(){
        System.out.println(controller.findTheHighestPriceProduct());
    }

//    public void readFile() {
//        controller.readFile();
//    }

    public void writeDataToFile() {
        controller.writeDataToFile();
    }
}

