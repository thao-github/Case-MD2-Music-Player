package HomeWork.productMangerQuan99.view;

import java.util.Scanner;

public class Main {
    public Main() {
        while (true) {
            System.out.println("---MENU---");
            System.out.println("1.Display Product");
            System.out.println("2.Add New Product");
            System.out.println("3.Update Product");
            System.out.println("4.Delete Product");
            System.out.println("5.Sort Product");
            System.out.println("6.Find The Highest Price Product");
            System.out.println("7.Read File Product");
            System.out.println("8.Write Product To File");
            System.out.println("9.Exit");

            System.out.println("Enter your CHOICE: ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());

            ProductView productView = new ProductView();

            switch (choice) {
                case 1:
                    productView.formDisplayProduct();
                    break;
                case 2:
                    productView.formAddProduct();
                    break;
                case 3:
                    productView.formUpdateProduct();
                    break;
                case 4:
                    productView.deleteProduct();
                    break;
                case 5:
                    productView.sortProduct();
                    break;
                case 6:
                    productView.findTheHighestPriceProduct();
                    break;
                case 7:
//                    productView.readFile();
                      break;
                case 8:
                    productView.writeDataToFile();
                    break;
                case 9:
                    break;
            }

        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
