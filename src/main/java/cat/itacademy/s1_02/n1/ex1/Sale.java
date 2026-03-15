package cat.itacademy.s1_02.n1.ex1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}