package HomeWork.productMangerQuan99.Controller;

import HomeWork.productMangerQuan99.model.Product;

public class PriceComparator implements java.util.Comparator <Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
